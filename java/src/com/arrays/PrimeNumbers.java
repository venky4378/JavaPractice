package com.arrays;

import java.util.Scanner;

// Count prime numbers in an array
// Printing prime numbers also


public class PrimeNumbers {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 8, 11, 15, 17, 20, 3, 6, 9, 13, 19, 21, 25, 29 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				count++;
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Count of prime numbers in arr : " + count);

	}

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
			}
		}
		return status;
	}

}
