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
import com.api.service.AreaService;
import com.api.util.RespJson;
import com.api.util.RespJsonFactory;

/**
 * 区域管理控制层
 * 
 * @author HCK
 *
 */
@Controller
@RequestMapping("/v1.0/areas")
public class AreaController {

	@Resource
	private AreaService areaService;

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
	public RespJson listArea(HttpServletRequest request, @RequestParam Map<String, Object> param) {
		RespJson respJson = null;
		try {
			respJson = areaService.list(request, param);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}

	/**
	 * 【新增】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param param
	 *            请求参数
	 * @return 操作结果
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public RespJson saveArea(HttpServletRequest request, @RequestBody Map<String, Object> param) {
		RespJson respJson = null;
		try {
			respJson = areaService.save(request, param);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}

	/**
	 * 【删除】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param areaId
	 *            区域编码
	 * @return 操作结果
	 */
	@RequestMapping(value = "/{areaId}", method = RequestMethod.DELETE)
	@ResponseBody
	public RespJson removeArea(HttpServletRequest request, @PathVariable("areaId") String areaId) {
		RespJson respJson = null;
		try {
			respJson = areaService.remove(request, areaId);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}
}
