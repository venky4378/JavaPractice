package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.model.Student;

public class StudentDAO implements StudentDaoInterface{

	Connection con = null;
	@Override
	public void insertStudent(Student s) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch71","root","root");
			PreparedStatement ps = con.prepareStatement("insert into students (firstname,lastname) values(?,?)");
			int n = ps.executeUpdate();
			ps.setString(1, s.getFirstname());
			ps.setString(2, s.getLastname());
			
			
			if(n>0) {
				System.out.println(n + "rows affected");
			}else {
				System.err.println("Not effected");
			}
			
		}catch(Exception e) {
			
		}
	}

}
