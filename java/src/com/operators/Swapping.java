package com.operators;

public class Swapping {
	static int a;
	static int b;
	static int c;	

	public static void main(String[] args) {
		a = 30;
		b = 40;
		c = 50;
		System.out.println("before a :"+a);
		System.out.println("before b :"+b);
		
//		b = a + b;  // b -->70
//		a = b - a;  //a -->40
//		b = b-a;
//		
		c = a + b + c; //c --->120
		b = c-a-b;  // b--->50
		a = c-b-a;  //a--> 40
		c = c - b- a;
		
		System.out.println("a : "+a);
		System.out.println("b  : "+b);
		System.out.println("c :" + c);
	}

}
