package com.conditions.loops.whil;

import java.util.Scanner;

//Strong Numbers
//A number is strong if the sum of factorials of its digits equals the number.
//Example: 145 → 1! + 4! + 5! = 145 → Strong.

public class StrongNumber {

	static boolean isStrong(int n) {
		boolean status = false;
		int temp = n;
		int sum = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;
			
			int fact = 1;
			for (int i = 1; i <= r; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;

		}
		if (sum == temp) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();

		boolean flag = isStrong(n);
		if (flag) {
			System.out.println("Is Strong");
		} else {
			System.out.println("Not a Strong");
		}

	}

}
