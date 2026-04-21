package com.language.constructors;

public class TestDemoConst03 {
	
	protected int id = 1234;
	protected int emp = 98765;
	
	protected TestDemoConst03(){
		System.out.println("Constructor from another file  called");
	}
	
	
	

	public static void main(String[] args) {
		
		
		TestDemoConst03 s = new TestDemoConst03();
		System.out.println("main method called");
		

		
		
	}

}
