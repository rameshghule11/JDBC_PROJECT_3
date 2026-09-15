package com.exception;

public class EmployeesNotFoundException extends RuntimeException {

	public EmployeesNotFoundException(String msg)
	{
		super(msg);
	}
}
