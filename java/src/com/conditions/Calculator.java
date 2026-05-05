package com.conditions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Operand 1 : ");
		int operand1 = sc.nextInt();
		System.out.println("Enter Operand 2 : ");
		int operand2 = sc.nextInt();
		System.out.println("Enter Operator : ");
		String operator = sc.next();

		if (operator == "+") {
			int sum = operand1 + operand2;
			System.out.println("Sum Operation : +");
			System.out.println(sum);
		} else if (operator == "-") {
			int difference = operand1 - operand2;
			System.out.println("Difference : - ");
			System.out.println(difference);
		} else if (operator == "*") {
			int product = operand1 * operand2;
			System.out.println("product : * ");
			System.out.println(product);
		} else if (operator == "/") {
			int quotient = operand1 / operand2;
			System.out.println("Division : / ");
			System.out.println(quotient);
		}
	}
}
