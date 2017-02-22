package com.api.util;

public class RespJsonFactory {

	public static final Integer SUCCESS = 1;

	public static final Integer WARNING = 0;

	public static final Integer FAIL = -1;
	
	public static final Integer NOTLOGIN = -9;
	
	public static RespJson buildSuccess() {
		return buildInfo(SUCCESS, null, null, null);
	}

	public static RespJson buildSuccess(String msg) {
		return buildInfo(SUCCESS, msg, null, null);
	}
	
	public static RespJson buildSuccess(Object data) {
		return buildInfo(SUCCESS, null, data, null);
	}

	public static RespJson buildWarning(String msg) {
		return buildInfo(WARNING, msg, null, null);
	}
	
	public static RespJson buildWarning(String msg, int code) {
		return buildInfo(WARNING, msg, null, code);
	}
	
	public static RespJson buildFailure(String msg) {
		return buildInfo(FAIL, msg, null, null);
	}
	
	public static RespJson buildNotLogin() {
		return buildInfo(NOTLOGIN, null, null, null);
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
