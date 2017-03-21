package com.api.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.api.constant.SysConstants;
import com.api.dao.OperateLogDao;
import com.api.dao.SiteDao;
import com.api.entity.DefinitionEntity;
import com.api.entity.DictEntity;
import com.api.entity.DictTypeEntity;
import com.api.entity.OperateLogEntity;
import com.api.entity.SiteEntity;
import com.api.exception.APIException;
import com.api.exception.HttpClientException;
import com.api.exception.HttpConnectionException;
import com.api.util.DateUtils;
import com.api.util.HttpClientUtils;
import com.api.util.PrimaryKeyUtils;
import com.api.util.RespJson;
import com.api.util.RespJsonFactory;
import com.google.common.net.HostAndPort;
import com.orbitz.consul.Consul;
import com.orbitz.consul.HealthClient;
import com.orbitz.consul.model.State;
import com.orbitz.consul.model.health.HealthCheck;
import com.orbitz.consul.model.health.ServiceHealth;

public abstract class BaseService {

	@Resource
	protected OperateLogDao operateLogDao;

	@Resource
	protected SiteDao siteDao;

	@Resource
	protected DictTypeService dictTypeService;
	
	@Resource
	protected DefinitionService definitionService;

	/**
	 * 日志对象
	 */
	protected Logger logger = Logger.getLogger(getClass());

	/**
	 * 根据站点编码获取httpUrl
	 * 
	 * @param siteId
	 *            站点编码
	 * @return 管理接口和监控接口url键值对。SysConstants.MANAGEHTTPURL:管理接口url
	 *         SysConstants.MONITORHTTPURL:监控接口url
	 */
	public Map<String, String> getHttpUrlBySiteId(String siteId) {
		SiteEntity site = siteDao.get(siteId);
		if (site != null) {
			String consulIps = site.getConsulIps();
			int consulPort = site.getConsulPort();
			String mgmPrefix = site.getMgmPrefix();
			String horusServerPrefix = site.getHorusServerPrefix();
			return getHttpUrl(consulIps, consulPort, mgmPrefix, horusServerPrefix);
		}
		return null;
	}

	/**
	 * 根据consul地址,端口,资源管理过滤条件和监控管理过滤条件获取httpUrl
	 * 
	 * @param consulIps
	 *            consul地址
	 * @param consulPort
	 *            consul端口
	 * @param mgmPrefix
	 *            资源管理过滤条件
	 * @param horusServerPrefix
	 *            监控管理过滤条件
	 * @return
	 */
	public Map<String, String> getHttpUrl(String consulIps, int consulPort, String mgmPrefix,
			String horusServerPrefix) {
		Map<String, String> httpUrlMap = new HashMap<String, String>();
		String[] consulIpArr = consulIps.split(";");
		Consul consul = null;
		for (String consulIp : consulIpArr) {
			HostAndPort hostAndPort = HostAndPort.fromParts(consulIp, consulPort);
			try {
				consul = Consul.builder().withHostAndPort(hostAndPort).build();
				break;
			} catch (Exception e) {

			}
		}
		if (consul != null) {
			HealthClient healthClient = consul.healthClient();
			List<HealthCheck> healthCheckList = healthClient.getChecksByState(State.PASS).getResponse();

			for (HealthCheck healthCheck : healthCheckList) {
				if (healthCheck.getServiceName().get().startsWith(mgmPrefix)) {
					List<ServiceHealth> serviceHealthList = healthClient
							.getHealthyServiceInstances(healthCheck.getServiceName().get()).getResponse();
					for (ServiceHealth serviceHealth : serviceHealthList) {
						if (serviceHealth.getService().getService().equals(healthCheck.getServiceName().get())) {
							String manageHttpUrl = "http://" + serviceHealth.getService().getAddress() + ":"
									+ serviceHealth.getService().getPort();
							httpUrlMap.put(SysConstants.HTTPURL_MANAGE, manageHttpUrl);
							break;
						}
					}
					break;
				}
			}

			for (HealthCheck healthCheck : healthCheckList) {
				if (healthCheck.getServiceName().get().startsWith(horusServerPrefix)) {
					List<ServiceHealth> serviceHealthList = healthClient
							.getHealthyServiceInstances(healthCheck.getServiceName().get()).getResponse();
					for (ServiceHealth serviceHealth : serviceHealthList) {
						if (serviceHealth.getService().getService().equals(healthCheck.getServiceName().get())) {
							String monitorHttpUrl = "http://" + serviceHealth.getService().getAddress() + ":"
									+ serviceHealth.getService().getPort();
							httpUrlMap.put(SysConstants.HTTPURL_MONITOR, monitorHttpUrl);
							break;
						}
					}
					break;
				}
			}
		}
		return httpUrlMap;
	}

	/**
	 * 发送httpGet请求
	 * 
	 * @param session
	 *            HttpSession 对象
	 * @param siteId
	 *            站点编码
	 * @param interfaceType
	 *            接口类型
	 * @param url
	 *            接口url
	 * @return 请求结果
	 * @throws HttpConnectionException
	 *             http连接异常
	 * @throws HttpClientException
	 *             httpClient异常
	 */
	public RespJson sendHttpGet(HttpSession session, String siteId, String interfaceType, String url)
			throws HttpConnectionException, HttpClientException {
		return sendHttp(session, siteId, interfaceType, url, HttpClientUtils.METHOD_GET, null);
	}

	/**
	 * 发送httpPost的创建请求
	 * 
	 * @param session
	 *            HttpSession 对象
	 * @param siteId
	 *            站点编码
	 * @param interfaceType
	 *            接口类型
	 * @param url
	 *            接口url
	 * @param jsonParam
	 *            参数
	 * @return 请求结果
	 * @throws HttpConnectionException
	 *             http连接异常
	 * @throws HttpClientException
	 *             httpClient异常
	 */
	public RespJson sendHttpPost(HttpSession session, String siteId, String interfaceType, String url,
			String jsonParam) throws HttpConnectionException, HttpClientException {
		return sendHttp(session, siteId, interfaceType, url, HttpClientUtils.METHOD_POST, jsonParam);
	}

	/**
	 * 发送httpPut请求
	 * 
	 * @param session
	 *            HttpSession 对象
	 * @param siteId
	 *            站点编码
	 * @param interfaceType
	 *            接口类型
	 * @param url
	 *            接口url
	 * @param jsonParam
	 *            参数
	 * @return 请求结果
	 * @throws HttpConnectionException
	 *             http连接异常
	 * @throws HttpClientException
	 *             httpClient异常
	 */
	public RespJson sendHttpPut(HttpSession session, String siteId, String interfaceType, String url, String jsonParam)
			throws HttpConnectionException, HttpClientException {
		return sendHttp(session, siteId, interfaceType, url, HttpClientUtils.METHOD_PUT, jsonParam);
	}

	/**
	 * 发送httpDelete请求
	 * 
	 * @param session
	 *            HttpSession 对象
	 * @param siteId
	 *            站点编码
	 * @param interfaceType
	 *            接口类型
	 * @param url
	 *            接口url
	 * @return 请求结果
	 * @throws HttpConnectionException
	 *             http连接异常
	 * @throws HttpClientException
	 *             httpClient异常
	 */
	public RespJson sendHttpDelete(HttpSession session, String siteId, String interfaceType, String url)
			throws HttpConnectionException, HttpClientException {
		return sendHttp(session, siteId, interfaceType, url, HttpClientUtils.METHOD_DELETE, null);
	}

	@SuppressWarnings("unchecked")
	private RespJson sendHttp(HttpSession session, String siteId, String interfaceType, String url, String methodName, 
			String jsonParam) throws HttpConnectionException, HttpClientException {
		RespJson httpRespJson = null;
		Map<String, String> httpurl_map = (Map<String, String>) session.getAttribute(SysConstants.SESSION_HTTPURL_MAP);
		if (httpurl_map == null) {
			httpurl_map = getHttpUrlBySiteId(siteId);
			String httpUrl = null;
			if (SysConstants.URL_TYPE_MANAGE.equals(interfaceType)) {
				httpUrl = httpurl_map.get(SysConstants.HTTPURL_MANAGE);
			} else if (SysConstants.URL_TYPE_MONITOR.equals(interfaceType)) {
				httpUrl = httpurl_map.get(SysConstants.HTTPURL_MONITOR);
			}
			if (httpUrl == null) {
				return RespJsonFactory.buildFailure("网络异常");
			} else {
				httpUrl = httpUrl + url;
				session.setAttribute(SysConstants.SESSION_HTTPURL_MAP, httpurl_map);
				if (HttpClientUtils.METHOD_POST.equals(methodName)) {
					httpRespJson = HttpClientUtils.sendHttpPost(httpUrl, jsonParam);
				} else if (HttpClientUtils.METHOD_PUT.equals(methodName)) {
					httpRespJson = HttpClientUtils.sendHttpPut(httpUrl, jsonParam);
				} else if (HttpClientUtils.METHOD_DELETE.equals(methodName)) {
					httpRespJson = HttpClientUtils.sendHttpDelete(httpUrl);
				} else if (HttpClientUtils.METHOD_GET.equals(methodName)) {
					httpRespJson = HttpClientUtils.sendHttpGet(httpUrl);
				}
			}
		} else {
			String httpUrl = null;
			if (SysConstants.URL_TYPE_MANAGE.equals(interfaceType)) {
				httpUrl = httpurl_map.get(SysConstants.HTTPURL_MANAGE);
			} else if (SysConstants.URL_TYPE_MONITOR.equals(interfaceType)) {
				httpUrl = httpurl_map.get(SysConstants.HTTPURL_MONITOR);
			}
			try {
				httpUrl = httpUrl + url;
				if (HttpClientUtils.METHOD_POST.equals(methodName)) {
					httpRespJson = HttpClientUtils.sendHttpPost(httpUrl, jsonParam);
				} else if (HttpClientUtils.METHOD_PUT.equals(methodName)) {
					httpRespJson = HttpClientUtils.sendHttpPut(httpUrl, jsonParam);
				} else if (HttpClientUtils.METHOD_DELETE.equals(methodName)) {
					httpRespJson = HttpClientUtils.sendHttpDelete(httpUrl);
				} else if (HttpClientUtils.METHOD_GET.equals(methodName)) {
					httpRespJson = HttpClientUtils.sendHttpGet(httpUrl);
				}
			} catch (HttpConnectionException e) {
				httpurl_map = getHttpUrlBySiteId(siteId);
				if (SysConstants.URL_TYPE_MANAGE.equals(interfaceType)) {
					httpUrl = httpurl_map.get(SysConstants.HTTPURL_MANAGE);
				} else if (SysConstants.URL_TYPE_MONITOR.equals(interfaceType)) {
					httpUrl = httpurl_map.get(SysConstants.HTTPURL_MONITOR);
				}
				if (httpUrl == null) {
					return RespJsonFactory.buildFailure("网络异常");
				} else {
					httpUrl = httpUrl + url;
					if (HttpClientUtils.METHOD_POST.equals(methodName)) {
						httpRespJson = HttpClientUtils.sendHttpPost(httpUrl, jsonParam);
					} else if (HttpClientUtils.METHOD_PUT.equals(methodName)) {
						httpRespJson = HttpClientUtils.sendHttpPut(httpUrl, jsonParam);
					} else if (HttpClientUtils.METHOD_DELETE.equals(methodName)) {
						httpRespJson = HttpClientUtils.sendHttpDelete(httpUrl);
					} else if (HttpClientUtils.METHOD_GET.equals(methodName)) {
						httpRespJson = HttpClientUtils.sendHttpGet(httpUrl);
					}
				}
			}
		}
		return httpRespJson;
	}

	/**
	 * 根据编码类型和编码获取显示内容
	 * 
	 * @param codeType
	 *            编码类型
	 * @param code
	 *            编码
	 * @return 显示内容
	 */
	public String getTextByCode(String codeType, String code) {
		List<DictTypeEntity> dictTypeList = dictTypeService.listDictTypeFromCache();
		for (DictTypeEntity dictType : dictTypeList) {
			if (dictType.getCode().equals(codeType)) {
				List<DictEntity> dictList = dictType.getDictList();
				for (DictEntity dict : dictList) {
					if (dict.getCode().equals(code)) {
						return dict.getName();
					}
				}
				return null;
			}
		}
		return null;
	}
	
	/**
	 * 获取定义代码
	 * 
	 * @param dictCode
	 * @return
	 */
	public String getDefinitionCode(String dictCode) {
		List<DefinitionEntity> definitionList = definitionService.listFromCache();
		for (DefinitionEntity definition : definitionList) {
			if (definition.getDictCode().equals(dictCode)) {
				return definition.getCode();
			}
		}
		return null;
	}

	/**
	 * 保存操作日志
	 * 
	 * @param modelName
	 *            操作模块名称
	 * @param action
	 *            操作动作
	 * @param objId
	 *            操作对象编码
	 * @param objName
	 *            操作对象名称
	 * @param createUserLoginName
	 *            操作者
	 * @return 操作日志对象
	 */
	public OperateLogEntity saveOperateLog(String modelName, String action, String objId, String objName,
			String createUserLoginName) {
		OperateLogEntity operateLog = new OperateLogEntity();
		operateLog.setId(PrimaryKeyUtils.uniqueId());
		operateLog.setModelName(modelName);
		operateLog.setAction(action);
		operateLog.setObjId(objId);
		operateLog.setObjName(objName);
		operateLog.setCreateDateTime(DateUtils.getCurrentDateTime());
		operateLog.setCreateUserLoginName(createUserLoginName);
		operateLogDao.save(operateLog);
		return operateLog;
	}

	/**
	 * 更新操作日志
	 * 
	 * @param operateLog
	 *            操作日志对象
	 */
	public void updateOperateLog(OperateLogEntity operateLog) {
		operateLogDao.update(operateLog);
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
	 * 更新
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
