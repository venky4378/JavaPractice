package com.language.constructors;

public class Constructors06 {
	
	String name;
	int age;
	
	Constructors06(String name, int age){
		this.name = name;
		this.age = age;
//		System.out.println("Name : " + name);
//		System.out.println("Age : "+ age);
	}
	

	public static void main(String[] args) {
		
		Constructors06 c1 = new Constructors06("Venky",22);
		
		System.out.println(c1.name);
		System.out.println(c1.age);
		
		
		

		
	}

}
