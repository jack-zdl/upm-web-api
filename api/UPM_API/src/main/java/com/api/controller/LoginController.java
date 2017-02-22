package com.api.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.api.exception.APIException;
import com.api.service.LoginService;
import com.api.util.RespJson;
import com.api.util.RespJsonFactory;

/**
 * 登录管理控制层
 * 
 * @author HCK
 *
 */
@Controller
@RequestMapping("/v1.0/login")
public class LoginController {

	@Resource
	private LoginService loginService;

	/**
	 * 登录验证
	 * 
	 * @param request
	 * @param param
	 * @return
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	@ResponseBody
	public RespJson login(HttpServletRequest request, @RequestBody Map<String, Object> param) {
		RespJson respJson = null;
		try {
			respJson = loginService.login(request, param);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}

	/**
	 * 登出
	 * 
	 * @param request
	 */
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	@ResponseBody
	public RespJson logout(HttpServletRequest request) {
		RespJson respJson = null;
		try {
			loginService.logout(request);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}
}
