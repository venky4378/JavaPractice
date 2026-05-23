package com.conditions.loops.whil;

import java.util.Scanner;

public class PrimeInNumbers {

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 1 && n == 0) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;

			boolean flag = isPrime(n);
			if (isPrime(n)) {
				System.out.println("Prime : " + n);
			} else {
				System.out.println("Not prime");
			}
		}

	}
}
