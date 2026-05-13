package com.conditions.loops;

import java.util.Scanner;

public class Prime {

	static boolean isPrime(int n) {
		boolean status = true;

		for (int i = 2; i <= n; i++) {
			if (n % 2 == 0) {
				status = false;
			}
		}
		return status;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

		boolean num = isPrime(n);

		System.out.println(num);
	}

}
