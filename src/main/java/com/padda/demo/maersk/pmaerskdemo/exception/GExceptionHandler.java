package com.padda.demo.maersk.pmaerskdemo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

@ControllerAdvice
public class GExceptionHandler {
	
	@ExceptionHandler(value = NoSuchMovieException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public @ResponseBody ErrorResponse handleException(NoSuchMovieException ex)
	{
		return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
	}

}
