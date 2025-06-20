package com.mphasis.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class MyExceptionHandler {
	
	@ResponseBody
	@ExceptionHandler(value = {EmployeeNotFoundException.class})
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErrorMapper handleException(Exception e, HttpServletRequest request) {
		String uri=request.getRequestURI();
		return new ErrorMapper(e.getMessage(), uri, LocalDate.now());
	}
}
