package com.conditions.loops.whil;

import java.util.Scanner;

public class NeonNumber {

	static int isNeonOrNot(int n) {
		boolean status = false;
		int r = 0;
		int sum = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
		}

		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int pow = n * n;

		int flag = isNeonOrNot(pow);
		System.out.println("Sum value pf square of that number is : "+flag);
		if (flag == n) {
			System.out.println("IS neon number");
		} else {
			System.out.println("Not a neon");
		}

	}

}
