package com.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCprepareStatement {

	public static void main(String[] args) {
		
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch71","root","root");
		PreparedStatement ps =con.prepareStatement("insert into student2 values(?,?,?)");
		ps.setInt(1, 5);
		ps.setString(2, "ramy");
		ps.setInt(3, 67);
		int n = ps.executeUpdate();
		System.out.println(n + "rows effected");
	}catch(Exception e) {
		System.out.println(e);
	}
	}

}
