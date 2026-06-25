package com.practice;

public class TestPractice03 {

	static {
		System.out.println("B");
	}
	static int x = method();
	
	static int method() {
		System.out.println("A");
		return 10;
	}
	
	
	public static void main(String[] args) {

		System.out.println("C");  
	}

}
