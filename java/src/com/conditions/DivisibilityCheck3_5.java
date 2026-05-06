package com.conditions;

import java.util.Scanner;

public class DivisibilityCheck3_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("give me number :  ");
		int num = sc.nextInt();

		if (num % 3 == 0) {
			if (num % 5 == 0) {
				System.out.println("Fizz Buzz");
			} else {
				System.out.println("Fizz");
			}
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println("Give me Correct number :");
		}

	}

}
