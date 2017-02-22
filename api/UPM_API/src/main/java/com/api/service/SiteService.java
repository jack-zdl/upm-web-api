package com.api.service;

import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.constant.DictConstants;
import com.api.constant.SysConstants;
import com.api.dao.SiteDao;
import com.api.entity.OperateLogEntity;
import com.api.entity.SiteEntity;
import com.api.entity.UserEntity;
import com.api.exception.APIException;
import com.api.util.DateUtils;
import com.api.util.PrimaryKeyUtils;
import com.api.util.RespJson;
import com.api.util.RespJsonFactory;

@Service
public class SiteService extends BaseService {
	
	@Resource
	private SiteDao siteDao;
	
	@Resource
	private DictTypeService dictTypeService;

	/**
	 * 获取站点列表
	 * 
	 * @param request
	 * @param param
	 * @return
	 * @throws APIException
	 */
	@Override
	public RespJson list(HttpServletRequest request, Map<String, Object> param) throws APIException {
		return null;
	}

	@Override
	public RespJson get(HttpServletRequest request, String id) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 新增站点
	 * 
	 * @param request
	 * @param param
	 * @return
	 * @throws APIException
	 */
	@Override
	@Transactional(rollbackFor = APIException.class)
	public RespJson save(HttpServletRequest request, Map<String, Object> param) throws APIException {
		try {
			HttpSession session = request.getSession();
			UserEntity user = (UserEntity)session.getAttribute(SysConstants.SESSION_USER);
			
			Date nowDate = DateUtils.getCurrentDateTime();
			
			SiteEntity site = new SiteEntity();
			site.setId(PrimaryKeyUtils.uniqueId());
			site.setName((String)param.get("name"));
			site.setRegionCode((String)param.get("regionCode"));
			site.setConsulIps((String)param.get("consulIps"));
			site.setConsulPort((Integer)param.get("consulPort"));
			site.setConsulToken((String)param.get("consulToken"));
			site.setMgmCa((String)param.get("consulToken"));
			site.setHoursServerCa((String)param.get("hoursServerCa"));
			site.setMsgPrefix((String)param.get("msgPrefix"));
			site.setHoursServerPrefix((String)param.get("hoursServerPrefix"));
			site.setCreateDateTime(nowDate);
			site.setCreateLoginUserName(user.getLoginName());
			siteDao.save(site);
			
			OperateLogEntity operateLog = new OperateLogEntity();
			operateLog.setId(PrimaryKeyUtils.uniqueId());
			operateLog.setOperateModelName(DictConstants.OPERATE_MODEL_SITE);
			operateLog.setOperateAction(DictConstants.OPERATE_ACTION_ADD);
			operateLog.setOperateObjId(site.getId());
			operateLog.setOperateObjName(site.getName());
			operateLog.setOperateLoginName(user.getLoginName());
			operateLog.setOperateDateTime(nowDate);
			operateLog.setOperateStatus(DictConstants.OPERATE_STATUS_OK);
			operateLogDao.save(operateLog);
			
			return RespJsonFactory.buildSuccess();
			
		} catch (Exception e) {
			logger.error("站点注册异常", e);
			throw new APIException("站点注册异常");
		}
	}

	@Override
	public RespJson update(HttpServletRequest request, Map<String, Object> param) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 删除站点
	 * 
	 * @param request
	 * @param id
	 * @return
	 * @throws APIException
	 */
	@Override
	public RespJson remove(HttpServletRequest request, String id) throws APIException {
		// TODO Auto-generated method stub
		return null;
	}

}
