package com.api.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

/**
 * IP处理工具类
 * 
 * @author HCK
 *
 */
public class IPUtils {

	/**
	 * 先从反向代理里找ip
	 * 
	 * @param request
	 * @return
	 */
	public static String getIp(HttpServletRequest request) {
		if (request == null) {
			return "";
		}
		String ip = request.getHeader("x-forwarded-for");
		if (StringUtils.isBlank(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;

	}

}
