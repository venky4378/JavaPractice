package com.conditions;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter A Value : ");
		int a = sc.nextInt();
		System.out.println("Enter B Value : ");
		int b = sc.nextInt();
		System.out.println("Enter C Value : ");
		int c = sc.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("A is bigger");
			} else {
				System.out.println("C is bigger");
			}
		} else {
			if (b > c) {
				System.out.println("B is bigger");
			} else {
				System.out.println("C is bigger");
			}

		}
	}
}
