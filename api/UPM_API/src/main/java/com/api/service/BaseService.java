package com.api.service;

import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import com.api.dao.OperateLogDao;
import com.api.exception.APIException;
import com.api.util.RespJson;

public abstract class BaseService {
	
	@Resource
	protected OperateLogDao operateLogDao;
	
	/**
	 * 日志对象
	 */
	protected Logger logger = Logger.getLogger(getClass());

	/**
	 * 根据站点编码获取httpUrl
	 * 
	 * @param siteId
	 * @return
	 * @throws APIException
	 */
	public Map<String, String> getHttpUrlBySiteId(String siteId) throws APIException {
		return null;
	}
	
	
	/**
	 * 获取列表
	 * 
	 * @param request
	 * @param param
	 * @return
	 * @throws APIException
	 */
	public abstract RespJson list(HttpServletRequest request, Map<String, Object> param) throws APIException;
	
	/**
	 * 获取单个对象
	 * 
	 * @param request
	 * @param param
	 * @return
	 * @throws APIException
	 */
	public abstract RespJson get(HttpServletRequest request, String id) throws APIException;

	/**
	 * 新增
	 * 
	 * @param request
	 * @param param
	 * @return
	 * @throws APIException
	 */
	public abstract RespJson save(HttpServletRequest request, Map<String, Object> param) throws APIException;
	
	/**
	 * 新增
	 * 
	 * @param request
	 * @param param
	 * @return
	 * @throws APIException
	 */
	public abstract RespJson update(HttpServletRequest request, Map<String, Object> param) throws APIException;

	/**
	 * 删除
	 * 
	 * @param request
	 * @param id
	 * @return
	 * @throws APIException
	 */
	public abstract RespJson remove(HttpServletRequest request, String id) throws APIException;
	
}
