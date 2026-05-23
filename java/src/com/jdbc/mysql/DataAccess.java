package com.jdbc.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataAccess implements DatAccessInterface {

	Connection con = null;

	@Override
	public void insertStudent(StudentModel sm) {

		try {

			DBConnection db = new DBConnection();
			con = db.getConnection();

			PreparedStatement ps =
					con.prepareStatement("insert into student values(?,?,?)");

			ps.setInt(1, sm.getRno());
			ps.setString(2, sm.getStname());
			ps.setInt(3, sm.getMarks());

			int n = ps.executeUpdate();

			System.out.println(n + " row inserted");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void selectAllStudents() {

	}
}