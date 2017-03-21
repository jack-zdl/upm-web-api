package com.api.util;

public class RespJsonFactory {

	public static RespJson buildSuccess() {
		return buildInfo(RespJson.SUCCESS, null, null, null);
	}

	public static RespJson buildSuccess(String msg) {
		return buildInfo(RespJson.SUCCESS, msg, null, null);
	}
	
	public static RespJson buildSuccess(Object data) {
		return buildInfo(RespJson.SUCCESS, null, data, null);
	}

	public static RespJson buildWarning(String msg) {
		return buildInfo(RespJson.WARNING, msg, null, null);
	}
	
	public static RespJson buildWarning(String msg, int code) {
		return buildInfo(RespJson.WARNING, msg, null, code);
	}
	
	public static RespJson buildFailure(String msg) {
		return buildInfo(RespJson.FAIL, msg, null, null);
	}
	
	public static RespJson buildNotLogin() {
		return buildInfo(RespJson.NOTLOGIN, null, null, null);
	}

	public static RespJson buildInfo(int result, String msg, Object data, Integer code) {
		RespJson respJson = new RespJson();
		respJson.setResult(result);
		respJson.setMsg(msg);
		respJson.setData(data);
		respJson.setCode(code);
		return respJson;
	}
}
