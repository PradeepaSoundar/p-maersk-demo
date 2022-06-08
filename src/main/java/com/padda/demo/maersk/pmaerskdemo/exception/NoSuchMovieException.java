package com.padda.demo.maersk.pmaerskdemo.exception;

public class NoSuchMovieException extends RuntimeException {

	private String message;
	  
    public NoSuchMovieException() {}
  
    public NoSuchMovieException(String msg)
    {
        super(msg);
        this.message = msg;
    }
}
