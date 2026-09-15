package com.service;

import java.util.ArrayList;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.exception.EmployeeNotFoundException;
import com.exception.EmployeesNotFoundException;
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
	
//	public Employee getEmployee(int id)
//	{
//		Employee employee=dao.getEmployeeById(id);
//		
//		if(employee == null)
//		{
//			throw new EmployeeNotFoundException("Employee not found with id :"+ id);
//		}
//		return employee;
//	}
	
	// get All Employee
	
	public ArrayList<Employee> getAll()
	{
		ArrayList<Employee> employees= dao.getAllEmployee(0);
		
		if(employees.isEmpty())
		{
			throw new EmployeesNotFoundException("No Employee Prsent In DB");
		}
		return employees;
	}
	

}

