package com.oops;

import java.util.Scanner;

public class FindArea {

	static Scanner sc = new Scanner(System.in);

	// triangle
	double findArea(float a, float b) {

		return 0.5 * a * b;
	}

	// circle
	double findArea(float radius) {
		return (Math.PI * radius * radius);
	}

	// square
	double findArea(double side) {
		return side * side;
	}

	// rectangle
	double findArea(int l, int b) {
		return l * b;
	}

	public static void main(String[] args) {

		// Using Polymorphism of Method Overloading we are using same method name with
		// different types of parameters

		FindArea fa = new FindArea();
		System.out.println("Give float value base for triangle : ");
		float a = sc.nextFloat();
		System.out.println("Give float value for height of triangle : ");
		float b = sc.nextFloat();
		double triangle = fa.findArea(a, b);

		System.out.println("Give circle radius : ");
		float radius = sc.nextFloat();
		double circle = fa.findArea(radius);

		System.out.println("Give side of square : ");
		int side = sc.nextInt();
		double square = fa.findArea(side);

		System.out.println("Give breadth value for rectangle : ");
		int breadth = sc.nextInt();
		System.out.println("give length value for rectangle : ");
		int length = sc.nextInt();
		double rectangle = fa.findArea(breadth, length);

		System.out.println("Triangle : " + triangle);
		System.out.println("Circle : " + circle);
		System.out.println("square : " + square);
		System.out.println("rectangle : " + rectangle);

	}
}
