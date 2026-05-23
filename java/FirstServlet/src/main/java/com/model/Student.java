package com.model;

public class Student {
	private String firstname;
	private String lastname;
	private int sno;
	
	public Student() {
		
	}
	
	public Student(int sno, String fn, String ln) {
		this.firstname = fn;
		this.lastname = ln;
		this.sno = sno;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public String toString() {
		return "This is model data: " +firstname + lastname;
	}
}
