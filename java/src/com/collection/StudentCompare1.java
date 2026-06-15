package com.collection;

import java.util.Comparator;

public class StudentCompare1   implements Comparable<StudentCompare1>{//implements Comparable<StudentCompare1>//{

	String name;
	int age;
	int salary;

	public StudentCompare1(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "StudentCompare1 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public int compareTo(StudentCompare1 o) {
		
		
		return this.name.compareTo(o.name);
	}

}
