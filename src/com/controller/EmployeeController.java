 package com.controller;

import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeController {

	
	EmployeeService service=new EmployeeService();
	
	// SAVE
	public String insertEmployee(Employee employee) {
		
	String msg =	service.insertEmployee(employee);
		
	return msg;
		
	}
	
	// update
	public String  update(Employee employee) {
		
		String msg= service.update(employee);
		
		return msg;
	}
	
	// DELETE
	
	public String delete(int id)
	{
		return service.delete(id);
		
	}
	
	
}
