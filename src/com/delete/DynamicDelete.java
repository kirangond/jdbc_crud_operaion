package com.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a city name to delete record: ");
			String city = sc.next();
			System.out.println("city:"+city);
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","Kiran@123");
		    Statement createStatement = connection.createStatement();
		    createStatement.executeUpdate("delete from student_info where city = '"+city+"'");
		    connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
