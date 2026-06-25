package com.language.methods;

public class Singleton{
	
	private static Singleton obj;
	
	private Singleton() {
		System.out.println("Object is created");
	}
	
	public static Singleton getObj() {
		if(obj == null) {
			obj = new Singleton();
		}
		return obj;
	}
	
	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getObj();
		Singleton s2 = Singleton.getObj();
		
		System.out.println(s1 == s2);
	}
}