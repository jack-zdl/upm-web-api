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
import com.api.service.OrderService;
import com.api.util.RespJson;
import com.api.util.RespJsonFactory;

/**
 * 工单管理控制层
 * 
 * @author HCK
 *
 */
@Controller
@RequestMapping("/v1.0/orders")
public class OrderController {

	@Resource
	private OrderService orderService;

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
	public RespJson listOrder(HttpServletRequest request, @RequestParam Map<String, Object> param) {
		RespJson respJson = null;
		try {
			respJson = orderService.list(request, param);
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
	public RespJson saveOrder(HttpServletRequest request, @RequestBody Map<String, Object> param) {
		RespJson respJson = null;
		try {
			respJson = orderService.save(request, param);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}
	
	/**
	 * 【编辑】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param orderId
	 *            工单编码
	 * @param param
	 *            请求参数
	 * @return 操作结果
	 */
	@RequestMapping(value = "/{orderId}", method = RequestMethod.PUT)
	@ResponseBody
	public RespJson updateOrder(HttpServletRequest request, @PathVariable("orderId") String orderId,
			@RequestBody Map<String, Object> param) {
		RespJson respJson = null;
		try {
			param.put("id", orderId);
			respJson = orderService.update(request, param);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}
	
	/**
	 * 【审批】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param orderId
	 *            工单编码
	 * @param param
	 *            请求参数
	 * @return 操作结果
	 */
	@RequestMapping(value = "/{orderId}/audit", method = RequestMethod.PUT)
	@ResponseBody
	public RespJson auditOrder(HttpServletRequest request, @PathVariable("orderId") String orderId,
			@RequestBody Map<String, Object> param) {
		RespJson respJson = null;
		try {
			param.put("id", orderId);
			respJson = orderService.audit(request, param);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}
	
	/**
	 * 【执行】
	 * 
	 * @param request
	 *            HttpServletRequest对象
	 * @param orderId
	 *            工单编码
	 * @param param
	 *            请求参数
	 * @return 操作结果
	 */
	@RequestMapping(value = "/{orderId}/execution", method = RequestMethod.PUT)
	@ResponseBody
	public RespJson executeOrder(HttpServletRequest request, @PathVariable("orderId") String orderId,
			@RequestBody Map<String, Object> param) {
		RespJson respJson = null;
		try {
			param.put("id", orderId);
			respJson = orderService.execute(request, param);
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
	 * @param orderId
	 *            工单编码
	 * @return 操作结果
	 */
	@RequestMapping(value = "/{orderId}", method = RequestMethod.DELETE)
	@ResponseBody
	public RespJson removeOrder(HttpServletRequest request, @PathVariable("orderId") String orderId) {
		RespJson respJson = null;
		try {
			respJson = orderService.remove(request, orderId);
		} catch (APIException e) {
			respJson = RespJsonFactory.buildFailure(e.getMessage());
		}
		return respJson;
	}
}
