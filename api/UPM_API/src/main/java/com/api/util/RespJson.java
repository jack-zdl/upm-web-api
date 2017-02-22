package com.api.util;

import java.io.Serializable;

public class RespJson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int result;
	private Integer code;
	private String msg;
	private Object data;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "RespJson [result=" + result + ", code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}

}
