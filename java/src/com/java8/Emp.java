package com.java8;

public class Emp {

	String name = "Mahesh";
	String role = "Manager";
	int age = 18;

	@Override
	public String toString() {
		return "Emp [name=" + name + ", role=" + role + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		Emp e = new Emp();

		System.out.println(e);

	}

}
