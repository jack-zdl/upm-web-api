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
@RequestMapping("v1.0/site")
public class SiteController {

	@Resource
	private SiteService siteService;

	/**
	 * 【查询】
	 * 
	 * @param request
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "list", method = RequestMethod.GET)
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
	 * 【新增】
	 * 
	 * @param request
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "save", method = RequestMethod.POST)
	@ResponseBody
	public RespJson saveSite(HttpServletRequest request, @RequestBody Map<String, Object> param) {
		RespJson respJson = null;
		try {
			respJson = siteService.save(request, param);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}

	/**
	 * 【删除】
	 * 
	 * @param request
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "remove/{siteId}", method = RequestMethod.DELETE)
	@ResponseBody
	public RespJson removeSite(HttpServletRequest request, @PathVariable("siteId") String siteId) {
		RespJson respJson = null;
		try {
			respJson = siteService.remove(request, siteId);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}
	
}
