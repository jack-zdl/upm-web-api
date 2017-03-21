package com.api.constant;

/**
 * 系统常量类
 * 
 * @author HCK
 *
 */
public class SysConstants {

	public static final String SESSION_USER = "session_user";
	public static final String SESSION_HTTPURL_MAP = "session_httpurl_map";

	public static final String URL_TYPE_MANAGE = "url_type_manage";
	public static final String URL_TYPE_MONITOR = "url_type_monitor";
	public static final String URL_VERSION = "v1.0";
	
	/**
	 * 任务查询频率(软件镜像创建30s查询一次)
	 */
	public static final int SEARCH_FREQUENCY_SOFTWAREIMAGE_CREATE = 30000;
	
	/**
	 * 任务查询频率(软件镜像删除30s查询一次)
	 */
	public static final int SEARCH_FREQUENCY_SOFTWAREIMAGE_DELETE = 30000;
	
	/**
	 * 任务查询频率(主机入库30s查询一次)
	 */
	public static final int SEARCH_FREQUENCY_HOST_INPUT = 30000;
	
	/**
	 * 管理接口url
	 */
	public static final String HTTPURL_MANAGE = "httpurl_manage";
	
	/**
	 * 监控接口url
	 */
	public static final String HTTPURL_MONITOR = "httpurl_monitor";
}
