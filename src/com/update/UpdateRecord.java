package com.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//to update a record
public class UpdateRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","Kiran@123");
		    Statement createStatement = connection.createStatement();
		    createStatement.executeUpdate("update student_info set city='Humnabad' where first_name='nishant' ");
		    connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
