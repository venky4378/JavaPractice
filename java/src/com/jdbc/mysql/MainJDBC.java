package com.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainJDBC {

	public static void main(String[] args) {
		try {
			
//		Loading / registring Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection establish
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch71","root","root");
//		\statement
		Statement st = con.createStatement();
		
//		execute & result set
		int n = st.executeUpdate("insert into student2 values(2,'Vikas',98)");
//		Result set
		System.out.println(n + " rows effected");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

		

//		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch71","root","root");
//		Statement st = con.createStatement();		
//		int n = st.executeUpdate("insert into student2 values(1,'Venky',100)");
//		System.out.println(n + " rows Effected");
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}

}
}



