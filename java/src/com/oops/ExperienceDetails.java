package com.oops;

import java.util.Scanner;

class Person {

	private String name;

	String setName(String name) {
		this.name = name;
		return name;
	}

	void showPerson() {
		System.out.println("Person Details : " + name);
	}

}

class Teacher extends Person {

	String subject;

	String setSubject(String subject) {
		this.subject = subject;
		return subject;
	}

	void showTeacher() {
		System.out.println("Teacher Details are means name : " + subject);
	}
}

class MathTeacher extends Teacher {
	private int Experience;

	int setExperience(int exp) {
		this.Experience = exp;
		return exp;
	}

	void showMathTeacher() {
		System.out.println("Show Math Teacher Experience: " + Experience);
	}
}

public class ExperienceDetails {

	public static void main(String[] args) {
		MathTeacher m1 = new MathTeacher();

		m1.setName("Navya");
		m1.setSubject("Maths");
		m1.setExperience(5);
		m1.showMathTeacher();
		m1.showTeacher();
		m1.showPerson();

	}

}
