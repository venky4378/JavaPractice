package com.language.constructors;

public class TestDemoConstructor01 {
	
	int a = 100;
	int b = 200;
	
	TestDemoConstructor01(){
		System.out.println("Coinstructor called");
	}

	public static void main(String[] args) {

		
		TestDemoConstructor01 a = new TestDemoConstructor01();
		System.out.println(a.a);
		System.out.println(a.b);
	}

}
