package com.sb.app.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection conn;
	static {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "USER2";
		String password = "12341234";
		
		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("DB Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getDBConnection() {
		return conn;
	}
}
