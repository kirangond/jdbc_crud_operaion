package com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//insert values dynamically
// duplicate entries possible - avoid it
public class DynamicInserting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//take user input  
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a first name: ");
			String first = sc.next();
			System.out.println("Enter a last name: ");
			String last_name = sc.next();
 
			//column name might not be same as variable name fine works properly
			System.out.println("Enter a city name: ");
			String city = sc.next();

			// connection to db
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root",
					"Kiran@123");
			System.out.println("connection: " + connection);
			
			//create statement
			Statement createStatement = connection.createStatement();
			
			//execute queries
			createStatement.executeUpdate("insert into student_info values ('"+first+"','"+last_name+"','"+city+"')");
            connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
