package com.conditions.loops;

import java.util.Scanner;

public class PerfectNumber {

	static boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number you want to do perfect Number : ");
		int n = sc.nextInt();
		boolean stat = isPerfect(n);
		if (stat) {
			System.out.println("The given number is a perfect Number ");
		} else {
			System.out.println("The given number is not a perfect Number");
		}

	}	
	

}
