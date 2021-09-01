package com.corp.employee.exception;

public class InvalidDaysException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidDaysException(String message) {
		super(message);
	}
}
