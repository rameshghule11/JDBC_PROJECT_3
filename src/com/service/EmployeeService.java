package com.service;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.exception.SomethingWentWrongException;

public class EmployeeService {

	// Business Logic 
			
	
	EmployeeDao dao=new EmployeeDao();
	
	
// SAVE
	public String insertEmployee(Employee employee) {
		
		String msg=	dao.insertEmployee(employee);
		
		return msg;
	}
	
	
	//UPDATE 
	public String update(Employee employee){
		
		String msg=dao.updateEmployee(employee);
		
		return msg;
	}
	
	
	// DELETE 
	
	public String delete(int id) 
	{
		String msg=dao.delete(id);
		return msg;
	}
	
	// get Single Employee
	
	public Employee getEmployee(int id)
	{
		return dao.getEmployeeById(id);
	}

}

