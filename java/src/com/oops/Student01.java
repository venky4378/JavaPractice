package com.oops;
//Java
//1.Write a java program to demonostrate inheritence Create a parent class Person with fields name and age, and a method displayDetails().
//->Create a child class Student that extends Person and adds a field rollNo.
//->Add a method displayStudentInfo() in Student.
//->Create a Student object and initialize all values.
//Display both person and student details using inherited and child class methods.
public class Student01 extends Person{

	String name;
	String course;
	int rollNo;
	
	public void displayStudentInfo() {
		System.out.println(name);
		System.out.println(course);
		System.out.println(rollNo);
	}
	
	
	public static void main(String[] args) {
		Student01 st = new Student01();	
		st.displayStudentInfo();
		st.setName("Mahesh");
		st.showPerson();
		
		
	}

	
	
}
