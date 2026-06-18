package com.operators;

class Child{
	Child(){
		show();
	}
	void show() {
		System.out.println("parent method called");
	}
}
public class Parent  extends Child{
	
	int x =10;
	void show() {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		new Child();
	}
	
}
