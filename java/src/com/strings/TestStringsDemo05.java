package com.strings;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestStringsDemo05 {
	public static void main(String[] args) throws SQLException {
		System.out.println(Boolean.parseBoolean("saI"));
		Object obj = 10;
		System.out.println(obj instanceof Integer);
		System.out.println(obj instanceof Number);
		
		int a = 100;
		long b = 100L;
		System.out.println( a == b);
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		DriverManager.getConnection(null);
	}

}
