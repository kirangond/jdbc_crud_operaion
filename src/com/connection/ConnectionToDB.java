package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//class to connect with database
public class ConnectionToDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"jdbc:mysql://localhost:3306/testing", "root", "Kiran@123"
		//protocol:database:localhost:portnumber:db_name username password
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "Kiran@123");
			System.out.println("connection: "+connection);
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
