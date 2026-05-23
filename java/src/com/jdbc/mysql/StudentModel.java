package com.jdbc.mysql;

public class StudentModel {
	private int rno;
	private String stname;
	private int marks;

	public StudentModel() {

	}

	public StudentModel(int r, String s, int m) {
		this.rno = r;
		this.stname = s;
		this.marks = m;

	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String toString() {
		return this.stname + " : "+ this.rno +" : "+	 this.marks;
	}

}
