package com.jdbc.mysql;

public class MainJDBC2 {
	public static void main(String[] args) {
		DataAccess da = new DataAccess();
		StudentModel sm = new StudentModel();
		sm.setRno(7);
		sm.setStname("Mahesh");
		sm.setMarks(78);
		da.insertStudent(sm);
	}

}
