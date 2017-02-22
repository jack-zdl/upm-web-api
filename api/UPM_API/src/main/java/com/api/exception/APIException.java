package com.api.exception;

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
