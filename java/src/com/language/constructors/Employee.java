package com.language.constructors;
//child
public class Employee extends Person {
	
	Employee(int id,String name){
		super(id,name);
		System.out.println("parameterised constructor called child");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person e = new Person(101,"Venky");
		
	}

}

//parent
class Person{
	String name;
	int id;
	Person(){
		System.out.println("no arg parent");
	}
	
	Person(int id,String name){
		System.out.println("parameteruzed constructor called from parent");
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {

		
	}
}