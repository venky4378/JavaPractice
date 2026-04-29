package com.language.constructors;

public class Ecommerce {
	String name;
	String userType;
	String membershipType;

	Ecommerce() {
		userType = "Guest";
		name = "unknown";
		membershipType = "unknown";

	}

	Ecommerce(String name) {
		this();
		this.name = name;
		userType = "Registered";
	}

	Ecommerce(String name, String membershipType) {
		this(name);
		this.membershipType = membershipType;
		this.userType = "Premium";
	}

	void display() {
		System.out.println("name : " + name);
		System.out.println("userType : " + userType);
		System.out.println("membershipType : " + membershipType);
	}

	public static void main(String[] args) {
		Ecommerce e1 = new Ecommerce();
		e1.display();
		Ecommerce e2 = new Ecommerce("Venky");
		e2.display();
		Ecommerce e3 = new Ecommerce("Swamy", "Registered");
		e3.display();
	}
}