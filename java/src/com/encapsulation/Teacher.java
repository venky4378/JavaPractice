package com.encapsulation;

public class Teacher extends Student {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setMarks(1056);
		int marks = s1.getMarks();
		System.out.println("marks : "+ marks);
		

	}

}
