package com.retrieve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//to retrieve record
//go throgh storing in ResultSet and retrieving the value
public class RetrieveRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","Kiran@123");
		    Statement createStatement = connection.createStatement();
		    ResultSet set = createStatement.executeQuery("select * from student_info");
		    System.out.println("set: "+set);
		    
		   while(set.next())
		   {
			   //to print all the column with records
			   System.out.println(set.getString(1));
			   System.out.println(set.getString(2));
			   System.out.println(set.getString(3));
		   }
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
