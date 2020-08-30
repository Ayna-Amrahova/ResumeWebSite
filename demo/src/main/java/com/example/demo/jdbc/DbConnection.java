package com.example.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection {
	static Connection conn;
    PreparedStatement ps;
    ResultSet rs;
	public static void main(String[] args) {
		 try {
	            Class.forName("com.mysql.jdbc.Driver");
	            String username = "yourUsername";
	            String password = "yourPassword";
	            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourDB?useEncoding=true&characterEncoding-UTF8", username, password);
	            System.out.println("Database connection has been successfully!");
	        } catch (ClassNotFoundException | SQLException ex) {
	            System.out.println("Exception occured in connection:" + ex.toString());
	        }
	}

}
