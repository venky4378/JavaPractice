package com.conditions.loops;

import java.util.Scanner;

public class PracticePrimeNumber01 {

	static boolean isPrimeOrNot(int n) {
		boolean status = true;
		if(n == 1 ||  n == 0) {
			return false;
		}
		
		
		for (int j = 1; j <= n; j++) {
			if (n % j == 0) {
				status = false;
				break;

			}

		}
		return status;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		PracticePrimeNumber01 p = new PracticePrimeNumber01();
//		boolean status = p.isPrimeOrNot(n);
		for (int i = 1; i <= n; i++) {
			if (isPrimeOrNot(i)) {
				System.out.println("Prime Number : " + n);
			} else {
				System.out.println("Not a Prime Number : " + n);
			}
		}
	}

}
