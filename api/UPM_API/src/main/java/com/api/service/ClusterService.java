package com.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.api.constant.DictConstants;
import com.api.constant.DictTypeConstants;
import com.api.constant.SysConstants;
import com.api.dao.ClusterDao;
import com.api.dto.ClusterDto;
import com.api.dto.DefinitionSubServDto;
import com.api.entity.AreaEntity;
import com.api.entity.ClusterEntity;
import com.api.entity.ClusterSubServEntity;
import com.api.entity.DefinitionSubServEntity;
import com.api.entity.NfsBackupEntity;
import com.api.entity.OperateLogEntity;
import com.api.entity.UserEntity;
import com.api.exception.APIException;
import com.api.util.DateUtils;
import com.api.util.PrimaryKeyUtils;
import com.api.util.RespJson;
import com.api.util.RespJsonFactory;

/**
 * 集群管理业务处理类
 * 
 * @author HCK
 *
 */
@Service
public class ClusterService extends BaseService {

	@Resource
	private ClusterDao clusterDao;

	/**
	 * 获取集群列表
	 * 
	 * @param request
	 * @param param
	 * @return
	 * @throws APIException
	 */
	@Override
	public RespJson list(HttpServletRequest request, Map<String, Object> param) throws APIException {
		try {
			List<ClusterEntity> clusterList = clusterDao.list(param);
			String siteId = (String) param.get("siteId");
			HttpSession session = request.getSession();
			String url = "/" + SysConstants.URL_VERSION + "/clusters";
			RespJson httpRespJson = sendHttpGet(session, siteId, SysConstants.URL_TYPE_MANAGE, url);
			JSONArray respJsonArray = (JSONArray)httpRespJson.getData();
			if (httpRespJson.getResult() == RespJson.SUCCESS) {
				JSONArray jsonArray = new JSONArray();
				for (ClusterEntity cluster : clusterList) {
					ClusterDto clusterDto = new ClusterDto();
					clusterDto.setId(cluster.getId());
					clusterDto.setName(cluster.getName());
					clusterDto.setAreaId(cluster.getArea().getId());
					clusterDto.setAreaName(cluster.getArea().getName());
					clusterDto.setNfsBackupId(cluster.getNfsBackup().getId());
					clusterDto.setNfSBackupName(cluster.getNfsBackup().getName());
					List<DefinitionSubServDto> definitionSubServDtoList = new ArrayList<DefinitionSubServDto>();
					List<DefinitionSubServEntity> definitionSubServList = cluster.getDefinitionSubServList();
					for (DefinitionSubServEntity definitionSubServ : definitionSubServList) {
						DefinitionSubServDto definitionSubServDto = new DefinitionSubServDto();
						definitionSubServDto.setId(definitionSubServ.getId());
						definitionSubServDto.setName(definitionSubServ.getName());
						definitionSubServDto.setIcon(definitionSubServ.getIcon());
						definitionSubServDtoList.add(definitionSubServDto);
					}
					clusterDto.setDefinitionSubServList(definitionSubServDtoList);
					clusterDto.setEnabled(cluster.isEnabled());
					clusterDto.setEnabledText(
							getTextByCode(DictTypeConstants.STATUS_ENABLED, String.valueOf(cluster.isEnabled())));
					JSONObject jsonObject = findJSONObject(respJsonArray, cluster.getRelateId());
					if (jsonObject != null) {
						clusterDto.setMaxHostCount(String.valueOf(jsonObject.getIntValue("max_host")));
						clusterDto.setMaxUsage(String.valueOf(jsonObject.getIntValue("usage_limit")));
					}
					clusterDto.setCreateDateTime(DateUtils.dateTimeToString(cluster.getCreateDateTime()));
					clusterDto.setCreateLoginUserName(cluster.getCreateUserLoginName());
					jsonArray.add(clusterDto);
				}
				return RespJsonFactory.buildSuccess(jsonArray);
			} else {
				throw new APIException(httpRespJson.getMsg());
			}
		} catch (Exception e) {
			logger.error("集群查询异常", e);
			throw new APIException("集群查询异常:" + e.getMessage());
		}
	}

	@Override
	public RespJson get(HttpServletRequest request, String id) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 新增集群
	 * 
	 * @param request
	 * @param param
	 * @return
	 * @throws APIException
	 */
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(rollbackFor = APIException.class)
	public RespJson save(HttpServletRequest request, Map<String, Object> param) throws APIException {
		try {
			HttpSession session = request.getSession();
			UserEntity user = (UserEntity) session.getAttribute(SysConstants.SESSION_USER);

			// 集群编码
			String clusterId = PrimaryKeyUtils.uniqueId();
			// 站点编码
			String siteId = (String) param.get("siteId");
			// 区域编码
			String areaId = (String) param.get("areaId");
			// 备份存储编码
			String nfsBackupId = (String) param.get("nfsBackupId");
			// 集群名称
			String clusterName = (String) param.get("name");
			// 包含软件
			List<String> subservIdList = (List<String>) param.get("subservIds");
			// 最大使用率
			Integer maxUsage = (Integer) param.get("maxUsage");
			// 最大主机数量
			Integer maxHostCount = (Integer) param.get("maxHostCount");
			
			// 保存操作日志
			OperateLogEntity operateLog = saveOperateLog(DictConstants.OPERATE_MODEL_CLUSTER,
					DictConstants.OPERATE_ACTION_ADD, clusterId, clusterName, user.getLoginName());
			
			ClusterEntity cluster = new ClusterEntity();
			cluster.setId(clusterId);
			AreaEntity area = new AreaEntity();
			area.setId(areaId);
			cluster.setArea(area);
			cluster.setName(clusterName);
			NfsBackupEntity nfsBackup = new NfsBackupEntity();
			nfsBackup.setId(nfsBackupId);
			cluster.setNfsBackup(nfsBackup);
			cluster.setEnabled(true);
			cluster.setCreateDateTime(operateLog.getCreateDateTime());
			cluster.setCreateUserLoginName(user.getLoginName());
			clusterDao.save(cluster);
			
			for (String subservId : subservIdList) {
				ClusterSubServEntity clusterSubServ = new ClusterSubServEntity();
				DefinitionSubServEntity definitionSubServ = new DefinitionSubServEntity();
				definitionSubServ.setId(subservId);
				clusterSubServ.setCluster(cluster);
				clusterSubServ.setDefinitionSubServ(definitionSubServ);
				clusterDao.saveRelativity(clusterSubServ);
			}
			
			JSONObject jsonParam = new JSONObject();
			jsonParam.put("max_host", maxHostCount);
			jsonParam.put("usage_limit", maxUsage);
			
			String url = "/" + SysConstants.URL_VERSION + "/clusters";
			RespJson httpRespJson = sendHttpPost(session, siteId, SysConstants.URL_TYPE_MANAGE, url,
					jsonParam.toJSONString());
			if (httpRespJson.getResult() == RespJson.SUCCESS) {
				JSONObject resJson = (JSONObject)httpRespJson.getData();
				String relateId = resJson.getString("id");
				if (relateId == null) {
					return RespJsonFactory.buildFailure("集群新增失败：relateId为空");
				}
				cluster.setRelateId(resJson.getString("id"));
				clusterDao.update(cluster);
				return RespJsonFactory.buildSuccess("集群新增成功");
			} else {
				throw new APIException(httpRespJson.getMsg());
			}
		} catch (Exception e) {
			logger.error("集群新增异常", e);
			throw new APIException("集群新增异常:" + e.getMessage());
		}
	}

	@Override
	public RespJson update(HttpServletRequest request, Map<String, Object> param) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 集群删除
	 * 
	 * @param request
	 * @param id
	 * @return
	 * @throws APIException
	 */
	@Override
	@Transactional(rollbackFor = APIException.class)
	public RespJson remove(HttpServletRequest request, String id) throws APIException {
		try {
			HttpSession session = request.getSession();
			UserEntity user = (UserEntity) session.getAttribute(SysConstants.SESSION_USER);

			ClusterEntity cluter = clusterDao.get(id);
			if (cluter == null) {
				return RespJsonFactory.buildWarning("该集群已被其他用户删除");
			} else {
				// 保存操作日志
				saveOperateLog(DictConstants.OPERATE_MODEL_CLUSTER, DictConstants.OPERATE_ACTION_DELETE, id,
						cluter.getName(), user.getLoginName());

				clusterDao.remove(id);
				clusterDao.removeRelativity(id);
				String url = "/" + SysConstants.URL_VERSION + "/clusters/" + cluter.getRelateId();
				RespJson httpRespJson = sendHttpDelete(session, cluter.getArea().getSite().getId(),
						SysConstants.URL_TYPE_MANAGE, url);
				if (httpRespJson.getResult() == RespJson.SUCCESS) {
					return RespJsonFactory.buildSuccess("集群删除成功");
				} else {
					throw new APIException(httpRespJson.getMsg());
				}
			}
		} catch (Exception e) {
			logger.error("集群删除异常", e);
			throw new APIException("集群删除异常:" + e.getMessage());
		}
	}
	
	private JSONObject findJSONObject(JSONArray respJsonArray, String id) {
		if (respJsonArray == null) {
			return null;
		}
		for (int i = 0; i < respJsonArray.size(); i++) {
			JSONObject jsonObject = respJsonArray.getJSONObject(i);
			if (jsonObject.getString("id").equals(id)) {
				return jsonObject;
			}
		}
		return null;
	}

}
