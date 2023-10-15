package com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//insert values into the db
public class InsertIntoDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//connection to db
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","Kiran@123");
			//create statement for inserting
			Statement createStatement = connection.createStatement();
			//to write sql queries
			createStatement.executeUpdate("insert into student_info values('pavan','mehtre','hyd')");
			//close the connection costly resource
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
