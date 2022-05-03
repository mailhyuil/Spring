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
		
		// JDK 1.6 이상에서는 사용하지 않아도 된다
		// JDBC 가 4.0이 포함되어 있고
		// JDBC 4.0이상에서는 사용하지 않아도 된다.
		// String jdbcDriver = "oracle.jdbc.OracleDriver";
		// Class.forName(jdbcDriver);
		
		try {
			conn = DriverManager.getConnection(url, username, password);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// end static block
	
	/*
	 * 프로젝트가 start 될때 conn(DB연결) 객체가 자동으로 생성되어있고
	 * 필요할 때 getDBConnection() method를 통해 가져다 사용한다.
	 */
	public static Connection getDBConnection () {
		return conn;
	}
}
