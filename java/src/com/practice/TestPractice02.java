package com.practice;

class Parent {

	Parent() {
		display();
	}

	void display() {
		System.out.println("parent");
	}
}

class Child extends Parent {
	int x = 19;

	void display() {
		System.out.println("x is "+ x);
	}
}

public class TestPractice02 {
	public static void main(String[] args) {

		Parent p = new Child();
	}
}
