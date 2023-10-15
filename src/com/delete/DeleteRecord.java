package com.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","Kiran@123");
		    Statement createStatement = connection.createStatement();
		    createStatement.executeUpdate("delete from student_info where first_name = 'chai'");
		    connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
