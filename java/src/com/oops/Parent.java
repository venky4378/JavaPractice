package com.oops;
//Java
//1.Write a java program to demonostrate inheritence Create a parent class Person with fields name and age, and a method displayDetails().
//->Create a child class Student that extends Person and adds a field rollNo.
//->Add a method displayStudentInfo() in Student.
//->Create a Student object and initialize all values.
//Display both person and student details using inherited and child class methods.

public class Parent {
	
	String name;
	int id;
	int age;

	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	void displaydetails() {
		System.out.println(id);
		System.out.println(age);
		System.out.println(name);
	}
	
}
