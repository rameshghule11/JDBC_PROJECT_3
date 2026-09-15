package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.entity.Employee;
import com.jdbcConnection.JDBCUtil;

public class EmployeeDao {

	// DataBase Code

	Connection con = JDBCUtil.createConnection();

	// Create Table

//	public void createTable()
//	{
//		try {
//			Statement st=con.createStatement();
//			st.execute("create table employee(id int , name varchar(40),salary double,dep varchar(20),gender varchar(20),city varchar(20)"); 
//			System.out.println("Table Created");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		 
//	}
//	
	// SAVE EMPLOYEE

	public String insertEmployee(Employee employee) {

		try {
//			Statement st=con.createStatement();
//			st.execute("insert into employee values('"+employee.getId()+"','"+employee.getName()+"','"+employee.getSalary()+"','"+employee.getDep()+"','"+employee.getGender()+"','"+employee.getCity()+"')");

			PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?,?,?,?)");

			pst.setInt(1, employee.getId());
			pst.setString(2, employee.getName());
			pst.setDouble(3, employee.getSalary());
			pst.setString(4, employee.getDep());
			pst.setString(5, employee.getGender());
			pst.setString(6, employee.getCity());

			pst.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "Employee Inserted SuccessFully";
	}

	// Update

	public String updateEmployee(Employee employee) {

		try {
			PreparedStatement pst = con.prepareStatement("update employee set name=?, salary=?, dep=?, gender=?, city=? where id=?");
			pst.setString(1, employee.getName());
			pst.setDouble(2, employee.getSalary());
			pst.setString(3, employee.getDep());
			pst.setString(4, employee.getGender());
			pst.setString(5, employee.getCity());
			pst.setInt(6, employee.getId());

			int value=pst.executeUpdate();
			
			if(value>0) {
				return "Employee Updated SuccessFully";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
return null;
		
	}
	
	// DELETE 
	
	public String delete(int id) 
	{
		try {
		PreparedStatement pst= con.prepareStatement("delete from employee where id=?");
		
		pst.setInt(1, id);
		
		pst.executeUpdate();
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return  "employee deleted Sucessfully";
	}
	
	// get Single Employee
	
//	public Employee getEmployeeById(int id)
//	{
//		Employee employee=null;
//		try {
//		PreparedStatement pst=con.prepareStatement("Select * from employee where id =?");
//		
//		pst.setInt(1, id);
//		ResultSet rs= pst.executeQuery();
//		
//		while(rs.next())
//		{
//		int id1=rs.getInt("id");
//		String name=rs.getString("name");
//		String gender=rs.getString("gender");
//		String dep= rs.getString("dep");
//		String city=rs.getString("city");
//		Double salary=rs.getDouble("salary");
//		
//		 employee=new Employee(id1,name,salary,dep,city,gender);
//		}
//		
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		return employee;
//	}
//	
	
	// Get All Employee 
	
	public ArrayList<Employee> getAllEmployee(int id)
	{
		ArrayList<Employee> employees=new ArrayList<Employee>();
		
		
		
		Employee employee=null;
		try {
		PreparedStatement pst=con.prepareStatement("Select * from employee");
		
		ResultSet rs= pst.executeQuery();
		
		while(rs.next())
		{
		int id1=rs.getInt("id");
		String name=rs.getString("name");
		String gender=rs.getString("gender");
		String dep= rs.getString("dep");
		String city=rs.getString("city");
		Double salary=rs.getDouble("salary");
		
		 employee=new Employee(id1,name,salary,dep,city,gender);
		 
		 employees.add(employee);
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return employees;
	}
	
	
	
	
	

//	public static void main(String args []) {
//		
//		EmployeeDao dao=new EmployeeDao();
//		dao.createTable(); 
//		
//		Employee e=new Employee(3,"JAYSHREERAM",400215,"word","male","hurt");
//		e.setId(1);
//		e.setName("ShreeRam");
//		e.setSalary(1000000);
//		e.setDep("WORD");
//		e.setGender("Male");
//		e.setCity("In My Hert");
//		
//		dao.insertEmployee(e); 
//	}
}
