package com.encapsulation;

public class Student {

	private int marks;

	void setMarks(int marks) {
		if (marks > 0 && marks <= 100) {
			this.marks = marks;
		} else {
			System.out.println("Enter Correct marks : ");
		}
	}

	int getMarks() {
		return marks;
	}

}
