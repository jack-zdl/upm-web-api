package com.api.exception;

/**
 * API异常处理类
 * 
 * @author HCK
 *
 */
public class APIException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public APIException(){
		
	}
	
	public APIException(String msg) {
		super(msg);
	}
}
