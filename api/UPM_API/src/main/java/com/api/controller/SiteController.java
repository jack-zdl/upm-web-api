package com.api.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.api.exception.APIException;
import com.api.service.SiteService;
import com.api.util.RespJson;
import com.api.util.RespJsonFactory;

/**
 * 站点管理控制层
 * 
 * @author HCK
 *
 */
@Controller
@RequestMapping("v1.0/sites")
public class SiteController {

	@Resource
	private SiteService siteService;

	/**
	 * 【查询】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param param
	 *            请求参数
	 * @return 操作结果
	 */
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public RespJson listSite(HttpServletRequest request, @RequestParam Map<String, Object> param) {
		RespJson respJson = null;
		try {
			respJson = siteService.list(request, param);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}

	/**
	 * 【注册】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param param
	 *            请求参数
	 * @return 操作结果
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public RespJson registerSite(HttpServletRequest request, @RequestBody Map<String, Object> param) {
		RespJson respJson = null;
		try {
			respJson = siteService.save(request, param);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}

	/**
	 * 【注销】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param siteId
	 *            站点编码
	 * @return 操作结果
	 */
	@RequestMapping(value = "/{siteId}", method = RequestMethod.DELETE)
	@ResponseBody
	public RespJson deregisterSite(HttpServletRequest request, @PathVariable("siteId") String siteId) {
		RespJson respJson = null;
		try {
			respJson = siteService.remove(request, siteId);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}

}
