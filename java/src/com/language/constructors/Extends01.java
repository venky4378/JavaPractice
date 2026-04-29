package com.language.constructors;

class Extends01 {
	
	Extends01(){
		System.out.println("Extends01 constructor called");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Extends01 e2 = new Extends01();
		System.out.println("main method ended");

	}

}


class Extends02 extends Extends01{
	Extends02(){
		
		//whenever we create the object it will call the current class constructor means this constructor in this constructor
		//it will call the super()	 constructor by default
		
		System.out.println("Extends02 constructor called");
	}
	public static void main(String[] args) {
		System.out.println("main method Started");
		Extends02 e = new Extends02();
		System.out.println("main method ended");
	}
}