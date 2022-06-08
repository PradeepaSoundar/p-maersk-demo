package com.padda.demo.maersk.pmaerskdemo.exception;

public class ErrorResponse {

	private int statusCode;
    private String message;
    
    public ErrorResponse(int statusCode, String msg) {
    	this.statusCode = statusCode;
    	this.message = msg;
    }
    
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}    
}
