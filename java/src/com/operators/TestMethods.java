package com.operators;

public class TestMethods {
	
	
	
	//4 - types
//	with return type with parameters
//	with return type without parameter
//	with 
	
	static void show() {
		System.out.println("Void Method called");
	}
	
	int discount(int a,int b) {
		int value = 5 * 10;
		
		return value;
	}
	
	
	
	void display() {
		int a  = 5;
		int b  = 6;
		System.out.println("Instance void method callws");
		System.out.println(a + b);
	}
	

	public static void main(String[] args) {

		TestMethods t1 = new TestMethods();
		
//		show();
//		t1.display();
		
		int discount = t1.discount();
		int product_price = 500;
		System.out.println(product_price - discount);
		
//		int val = t1.display2();
//		
//		System.out.println(val);
	}

}
