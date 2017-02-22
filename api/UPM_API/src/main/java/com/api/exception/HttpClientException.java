package com.api.exception;

public class HttpClientException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HttpClientException(){
		
	}
	
	public HttpClientException(String msg) {
		super(msg);
	}
}
