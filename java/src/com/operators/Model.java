package com.operators;

public class Model {
	
	private int sid;
	private String sname;
	private int age;
	private int salary;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		
		if(salary > 5000) {
		this.salary = salary;
		}
		}
	
	
	
	

}
