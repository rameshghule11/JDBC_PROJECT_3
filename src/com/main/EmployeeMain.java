package com.main;

import com.controller.EmployeeController;
import com.entity.Employee;
import com.exception.SomethingWentWrongException;

public class EmployeeMain {

	public static void  main(String args []) {
		
	EmployeeController controller=new EmployeeController();
	
	// SAVE
		
//		Employee e=new Employee(5,"JayShreeRam ",52551,"word","male","hurt");	
//		String msg= controller.insertEmployee(e);
//		
//		System.out.println(msg);
		
		
		
// UPDATE		
		
//		Employee e=new Employee(1,"Hanuman dada",525514,"word","male","hurt");
//		String msg=controller.update(e);
//		System.out.println(msg);
//		
// DELETE
		try {
		System.out.println(controller.delete(4));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
