package com.arrays;

//Largest Prime Number in a array
public class LargestPrime {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 11, 15, 17, 20, 3, 6, 9, 13, 19, 21, 25, 29 };
		int maxNumber = arr[0];
		int minNumber = arr[0];

		for (int i : arr) {
			if (isPrime(i)) {
				if (i > maxNumber) {
					maxNumber = i;
				} else if (i < minNumber) {
					minNumber = i;

				}
			}
		}
		System.out.println("Max Prime Number is : " + maxNumber);
		System.out.println("Min Prime Number is : " + minNumber);

	}

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
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

}
