package com.conditions.loops;

import java.util.Scanner;

public class PrimeOrNot {

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 1 || n == 0) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;

			}

		}

		return status;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int count = 0;
		System.out.println("Enter n1");
		int n1 = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				count++;
				if (count % 2 == 0) {
					System.out.println(i);

				}

			}
		}
		sc.close();

	}

}
