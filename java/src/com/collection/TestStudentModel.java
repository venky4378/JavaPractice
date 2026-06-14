package com.collection;

public class TestStudentModel {

	private int sid;
	private String name;
	private int age;
	private String course;
	
	
	@Override
	public String toString() {
		return "[Student :" + sid +
				" " + name + " " 
				+ age + " "
				+ course;
	}
	
	public TestStudentModel() {
		
	}
	
	
	public TestStudentModel(int sid, String name, int age, String course) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
