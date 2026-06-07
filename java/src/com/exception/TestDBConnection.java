package com.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestDBConnection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BATCH71", "root", "root");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM PATIENT;");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getInt(1) + " "+ rs.getString(2) + " "+ rs.getInt(3) + " ");
				System.out.println();
			}
			

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

//ps.setInt(1, 1);
//ps.setString(2, "Srinu");
//ps.setInt(3, 55);
//int n = ps.executeUpdate();

//if (n > 0) {
//System.out.println(n + "rows are affected");
//
//}
