package com.api.service;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.alibaba.fastjson.JSONArray;
import com.api.constant.DictConstants;
import com.api.constant.DictTypeConstants;
import com.api.constant.SysConstants;
import com.api.dao.AreaDao;
import com.api.dto.AreaDto;
import com.api.entity.AreaEntity;
import com.api.entity.OperateLogEntity;
import com.api.entity.SiteEntity;
import com.api.entity.UserEntity;
import com.api.exception.APIException;
import com.api.util.DateUtils;
import com.api.util.PrimaryKeyUtils;
import com.api.util.RespJson;
import com.api.util.RespJsonFactory;

/**
 * 区域管理业务处理类
 * 
 * @author HCK
 *
 */
@Service("areaService")
public class AreaService extends BaseService {

	@Resource
	private AreaDao areaDao;

	/**
	 * 获取区域列表
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
			List<AreaEntity> areaList = areaDao.list(param);
			JSONArray jsonArray = new JSONArray();
			for (AreaEntity area : areaList) {
				AreaDto areaDto = new AreaDto();
				areaDto.setId(area.getId());
				areaDto.setName(area.getName());
				areaDto.setDescription(area.getDescription());
				areaDto.setEnabled(area.isEnabled());
				areaDto.setEnabledText(
						getTextByCode(DictTypeConstants.STATUS_ENABLED, String.valueOf(area.isEnabled())));
				areaDto.setCreateDateTime(DateUtils.dateTimeToString(area.getCreateDateTime()));
				areaDto.setCreateLoginUserName(area.getCreateUserLoginName());
				jsonArray.add(areaDto);
			}
			return RespJsonFactory.buildSuccess(jsonArray);
		} catch (Exception e) {
			logger.error("区域查询异常", e);
			throw new APIException("区域查询异常:" + e.getMessage());
		}

	}

	@Override
	public RespJson get(HttpServletRequest request, String id) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 区域新增
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

			// 区域编码
			String areaId = PrimaryKeyUtils.uniqueId();
			// 区域名称
			String areaName = (String) param.get("name");
			// 区域描述
			String description = (String) param.get("description");
			// 站点编码
			String siteId = (String) param.get("siteId");

			// 保存操作日志
			OperateLogEntity operateLog = saveOperateLog(DictConstants.OPERATE_MODEL_AREA,
					DictConstants.OPERATE_ACTION_ADD, areaId, areaName, user.getLoginName());

			AreaEntity area = new AreaEntity();
			area.setId(areaId);
			area.setName(areaName);
			area.setDescription(description);
			area.setEnabled(true);
			area.setCreateDateTime(operateLog.getCreateDateTime());
			area.setCreateUserLoginName(user.getLoginName());
			SiteEntity site = new SiteEntity();
			site.setId(siteId);
			area.setSite(site);

			areaDao.save(area);

			return RespJsonFactory.buildSuccess();
		} catch (Exception e) {
			logger.error("区域新增异常", e);
			throw new APIException("区域新增异常:" + e.getMessage());
		}
	}

	@Override
	@Transactional(rollbackFor = APIException.class)
	public RespJson update(HttpServletRequest request, Map<String, Object> param) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 区域删除
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param id
	 *            区域编码
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
			AreaEntity area = areaDao.get(id);
			if (area == null) {
				return RespJsonFactory.buildWarning("该区域已被其他用户删除");
			} else {
				// 保存操作日志
				saveOperateLog(DictConstants.OPERATE_MODEL_AREA, DictConstants.OPERATE_ACTION_DELETE, id,
						area.getName(), user.getLoginName());

				areaDao.remove(id);
				return RespJsonFactory.buildSuccess("区域删除成功");
			}
		} catch (Exception e) {
			logger.error("区域删除异常", e);
			throw new APIException("区域删除异常:" + e.getMessage());
		}
	}

}
