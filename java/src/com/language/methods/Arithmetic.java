package com.language.methods;

import java.util.Scanner;

public class Arithmetic {

	static double getAdd(double a, double b) {
		double sum = a + b;
		return sum;

	}

	static double getSub(double a, double b) {
		double sub = a - b;
		return sub;

	}

	static double getmul(double a, double b) {
		double mul = a * b;
		return mul;
	}

	static double getDiv(double a, double b) {
		double div = a / b;
		return div;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value for sum : ");
		double a = sc.nextDouble();
		System.out.println("Enter b value for sum : ");
		double b = sc.nextDouble();
		System.out.println("Enter c value for sub : ");
		double c = sc.nextDouble();
		System.out.println("Enter d value for mul :");
		double d = sc.nextDouble();
		System.out.println("Enter e value for div : ");
		double e = sc.nextDouble();

		double s = getAdd(a, b);

		double t = getSub(s, c);
		double u = getmul(t, d);
		double v = getDiv(u, e);

		System.out.println(s);
		System.out.println(t);
		System.out.println(u);
		System.out.println(v);

	}

}
