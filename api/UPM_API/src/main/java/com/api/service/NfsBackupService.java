package com.api.service;

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
import com.api.dao.NfsBackupDao;
import com.api.dto.NfsBackupDto;
import com.api.entity.NfsBackupEntity;
import com.api.entity.OperateLogEntity;
import com.api.entity.SiteEntity;
import com.api.entity.UserEntity;
import com.api.exception.APIException;
import com.api.util.DateUtils;
import com.api.util.NumberUtils;
import com.api.util.PrimaryKeyUtils;
import com.api.util.RespJson;
import com.api.util.RespJsonFactory;

/**
 * 备份存储管理业务处理类
 * 
 * @author HCK
 *
 */
@Service("nfsBackupService")
public class NfsBackupService extends BaseService {

	@Resource
	private NfsBackupDao nfsBackupDao;

	/**
	 * 获取备份存储列表
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param param
	 *            请求参数
	 * @return 操作结果
	 * @throws APIException
	 *             API异常
	 */
	@Override
	public RespJson list(HttpServletRequest request, Map<String, Object> param) throws APIException {
		try {
			List<NfsBackupEntity> nfsBackupList = nfsBackupDao.list(param);
			String siteId = (String) param.get("siteId");
			HttpSession session = request.getSession();
			JSONArray jsonArray = new JSONArray();
			for (NfsBackupEntity nfsBackup : nfsBackupList) {
				NfsBackupDto nfsBackupDto = new NfsBackupDto();
				nfsBackupDto.setId(nfsBackup.getId());
				nfsBackupDto.setName(nfsBackup.getName());
				nfsBackupDto.setEnabled(nfsBackup.isEnabled());
				nfsBackupDto.setEnabledText(
						getTextByCode(DictTypeConstants.STATUS_ENABLED, String.valueOf(nfsBackup.isEnabled())));
				nfsBackupDto.setNfsIp(nfsBackup.getNfsIp());
				nfsBackupDto.setNfsDir(nfsBackup.getNfsDir());
				nfsBackupDto.setNfsMountDir(nfsBackup.getNfsMountDir());
				nfsBackupDto.setNfsMountOpts(nfsBackup.getNfsMountOpts());
				nfsBackupDto.setCreateDateTime(DateUtils.dateTimeToString(nfsBackup.getCreateDateTime()));
				nfsBackupDto.setCreateLoginUserName(nfsBackup.getCreateUserLoginName());
				
				String url = "/" + SysConstants.URL_VERSION + "/nfs_backups/space?nfs_ip=" + nfsBackup.getNfsIp() 
						+ "&nfs_dir=" + nfsBackup.getNfsDir() 
						+ "&nfs_mount_dir=" + nfsBackup.getNfsMountDir()
						+ "&nfsMountOpts=" + nfsBackup.getNfsMountOpts();
				RespJson httpRespJson = sendHttpGet(session, siteId, SysConstants.URL_TYPE_MANAGE, url);
				if (httpRespJson.getResult() == RespJson.SUCCESS) {
					String totalSpace = NumberUtils.byteToG(((JSONObject) httpRespJson.getData()).getLongValue("total_space"));
					nfsBackupDto.setTotalSpace(totalSpace);
					String freeSpace = NumberUtils.byteToG(((JSONObject) httpRespJson.getData()).getLongValue("free_space"));
					nfsBackupDto.setFreeSpace(freeSpace);
				} else {
					throw new APIException(httpRespJson.getMsg());
				}
				jsonArray.add(nfsBackupDto);
			}
			return RespJsonFactory.buildSuccess(jsonArray);
		} catch (Exception e) {
			logger.error("备份存储查询异常", e);
			throw new APIException("备份存储查询异常:" + e.getMessage());
		}
	}

	@Override
	public RespJson get(HttpServletRequest request, String id) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 备份存储新增
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param param
	 *            请求参数
	 * @return 操作结果
	 * @throws APIException
	 *             API异常
	 */
	@Override
	@Transactional(rollbackFor = APIException.class)
	public RespJson save(HttpServletRequest request, Map<String, Object> param) throws APIException {
		try {
			HttpSession session = request.getSession();
			UserEntity user = (UserEntity) session.getAttribute(SysConstants.SESSION_USER);

			// 备份存储编码
			String nfsBackupId = PrimaryKeyUtils.uniqueId();
			// 备份存储名称
			String nfsBackupName = (String) param.get("name");
			// 站点编码
			String siteId = (String) param.get("siteId");
			// nfs地址
			String nfsIp = (String) param.get("nfsIp");
			// nfs源目录
			String nfsDir = (String) param.get("nfsDir");
			// nfs挂载目录
			String nfsMountDir = (String) param.get("nfsMountDir");
			// nfs挂载参数
			String nfsMountOpts = (String) param.get("nfsMountOpts");
			
			// 保存操作日志
			OperateLogEntity operateLog = saveOperateLog(DictConstants.OPERATE_MODEL_NFSBACKUP,
					DictConstants.OPERATE_ACTION_ADD, nfsBackupId, nfsBackupName, user.getLoginName());

			NfsBackupEntity nfsBackup = new NfsBackupEntity();
			nfsBackup.setId(nfsBackupId);
			nfsBackup.setName(nfsBackupName);
			nfsBackup.setNfsIp(nfsIp);
			nfsBackup.setNfsDir(nfsDir);
			nfsBackup.setNfsMountDir(nfsMountDir);
			nfsBackup.setNfsMountOpts(nfsMountOpts);
			nfsBackup.setEnabled(true);
			nfsBackup.setCreateDateTime(operateLog.getCreateDateTime());
			nfsBackup.setCreateUserLoginName(user.getLoginName());
			SiteEntity site = new SiteEntity();
			site.setId(siteId);
			nfsBackup.setSite(site);
			nfsBackupDao.save(nfsBackup);
			
			String url = "/" + SysConstants.URL_VERSION + "/nfs_backups/space?nfs_ip=" + nfsIp 
					+ "&nfs_dir=" + nfsDir 
					+ "&nfs_mount_dir=" + nfsMountDir
					+ "&nfsMountOpts=" + nfsMountOpts;
			RespJson httpRespJson = sendHttpGet(session, siteId, SysConstants.URL_TYPE_MANAGE, url);
			if (httpRespJson.getResult() == RespJson.SUCCESS) {
				return RespJsonFactory.buildSuccess("备份存储新增成功");
			} else {
				throw new APIException(httpRespJson.getMsg());
			}

		} catch (Exception e) {
			logger.error("备份存储新增异常", e);
			throw new APIException("备份存储新增异常:" + e.getMessage());
		}
	}

	@Override
	@Transactional(rollbackFor = APIException.class)
	public RespJson update(HttpServletRequest request, Map<String, Object> param) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 备份存储删除
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param id
	 *            备份存储编码
	 * @return 操作结果
	 * @throws APIException
	 *             API异常
	 */
	@Override
	@Transactional(rollbackFor = APIException.class)
	public RespJson remove(HttpServletRequest request, String id) throws APIException {
		try {
			HttpSession session = request.getSession();
			UserEntity user = (UserEntity) session.getAttribute(SysConstants.SESSION_USER);

			NfsBackupEntity nfsBackup = nfsBackupDao.get(id);
			if (nfsBackup == null) {
				return RespJsonFactory.buildWarning("该备份存储已被其他用户删除");
			} else {
				// 保存操作日志
				saveOperateLog(DictConstants.OPERATE_MODEL_NFSBACKUP, DictConstants.OPERATE_ACTION_DELETE, id,
						nfsBackup.getName(), user.getLoginName());

				nfsBackupDao.remove(id);
				return RespJsonFactory.buildSuccess("备份存储删除成功");
			}
		} catch (Exception e) {
			logger.error("备份存储删除异常", e);
			throw new APIException("备份存储删除异常:" + e.getMessage());
		}
	}

}
