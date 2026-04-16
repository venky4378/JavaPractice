package com.language.methods;


public class Method1 {
	
	
	static String getName() {
		String name = "Srinivas";
		return name;
	}
	
	
	
	static void getAge(int age){
		int a = age;
		System.out.println("Persons Age is : " + a);
		
	}
	


	public static void main(String[] args) {
		System.out.println("About My Bio data");
		String name = getName();
		getAge(17);
		System.out.println("MY Name is : "+ name);
		
		
	}

}
