package com.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// CONNECTION CODE 
public class JDBCUtil {
 
	private static final String url="jdbc:mysql://localhost:3306/17augast";
	private static final String username="root";
	private static final String password="root";
	
	public static Connection createConnection() 
	{
		Connection con=null;
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con= DriverManager.getConnection(url,username,password);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
