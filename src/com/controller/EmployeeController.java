 package com.controller;

import java.util.ArrayList;

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
	
	// get single Employee 
	 
//	public Employee getEmployee(int id)
//	{
//		return service.getEmployee(id);
//	}
	
	// Get All Employee 
	
	public ArrayList<Employee> getAll() {
		return service.getAll();
	}
	
}
