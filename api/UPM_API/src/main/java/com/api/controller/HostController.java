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
import com.api.service.HostService;
import com.api.util.RespJson;
import com.api.util.RespJsonFactory;

/**
 * 主机管理控制层
 * 
 * @author HCK
 *
 */
@Controller
@RequestMapping("/v1.0/hosts")
public class HostController {

	@Resource
	private HostService hostService;

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
	public RespJson listHost(HttpServletRequest request, @RequestParam Map<String, Object> param) {
		RespJson respJson = null;
		try {
			respJson = hostService.list(request, param);
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
	public RespJson registerHost(HttpServletRequest request, @RequestBody Map<String, Object> param) {
		RespJson respJson = null;
		try {
			respJson = hostService.save(request, param);
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
	 * @param hostId
	 *            主机编码
	 * @return 操作结果
	 */
	@RequestMapping(value = "/{hostId}", method = RequestMethod.DELETE)
	@ResponseBody
	public RespJson deRegisterHost(HttpServletRequest request, @PathVariable("hostId") String hostId) {
		RespJson respJson = null;
		try {
			respJson = hostService.remove(request, hostId);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}
	
	/**
	 * 【入库】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param hostId
	 *            主机编码
	 * @return 操作结果
	 */
	@RequestMapping(value = "/{hostId}/input", method = RequestMethod.PUT)
	@ResponseBody
	public RespJson inputHost(HttpServletRequest request, @PathVariable("hostId") String hostId) {
		RespJson respJson = null;
		try {
			respJson = hostService.input(request, hostId);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}
	
	/**
	 * 【出库】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param hostId
	 *            主机编码
	 * @param param
	 *            请求参数
	 * @return 操作结果
	 */
	@RequestMapping(value = "/{hostId}/output", method = RequestMethod.PUT)
	@ResponseBody
	public RespJson outputHost(HttpServletRequest request, @PathVariable("hostId") String hostId,
			@RequestBody Map<String, Object> param) {
		RespJson respJson = null;
		try {
			param.put("id", hostId);
			respJson = hostService.output(request, param);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}
}
