package com.language.constructors;

public class Product {
	String name;
	String brand;
	
	Product(){
		System.out.println("no arg constructor called from parent");
	}
	Product(String name,String brand){
		this.name = name;
		this.brand = brand;
		System.out.println("two parameter constructor called parent");
	}

	public static void main(String[] args) {
		System.out.println("main method started parent");
		
		System.out.println("main method ended parent");

		
	}

}

class Laptop extends Product{
	Laptop(String name,String brand){
		super(name,brand);
		System.out.println("parameterized constructor called child");
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Laptop l = new Laptop("dell","Lenovo");
		l.display();
		System.out.println("main method ended");
	}
	void display() {
		System.out.println("pname : "+ name);
		System.out.println("brnad : " + brand);
	}
}
