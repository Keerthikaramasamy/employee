package com.corp.employee.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.corp.employee.dto.ErrorResponse;
import com.corp.employee.exception.InvalidDaysException;

@RestControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler(value = { InvalidDaysException.class })
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorResponse invalidDaysException(Exception ex) {
		return new ErrorResponse(500, ex.getMessage());
	}
}
