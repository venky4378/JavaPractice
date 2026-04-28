package com.language.constructors;

public class Model2 {
	int id;
	String name;
	int age;
	
	Model2(){
		this(101);
		System.out.println("no arg constructor called");
	}
	
	Model2(int id){
		this(id,"unknown");
		System.out.println("one parameter constructor called");
	}
	Model2(int id,String name){
		this(id,name,20);
		System.out.println("two parameter constructor called");
	}
	Model2(int id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
		System.out.println("three parameter constructor called");
	}
	void show() {
		System.out.println("id : "+ id);
		System.out.println("name : "+name);
		System.out.println("age : "+ age);
	}

	public static void main(String[] args) {

		Model2 m1 = new Model2();
		m1.show();
		
		Model2 m2 = new Model2(102,"malu",21);
		m2.show();
		
	}

}
