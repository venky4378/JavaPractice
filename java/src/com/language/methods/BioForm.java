package com.language.methods;

import java.util.Scanner;

class Bio {

	static void title() {
		System.out.println("--------------Bio Data---------");

	}

	void getDetails(String name, int age, String city) {

		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("City : " + city);

	}

}

public class BioForm {

	public static void main(String[] args) {

		Bio.title();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.next();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Enter your City : ");
		String city = sc.next();

		Bio b1 = new Bio();
		b1.getDetails(name, age, city);

	}

}
