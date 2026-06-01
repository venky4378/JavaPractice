package com.arrays;

//Count of Two elements in an array

public class CountTwos {

	public static void main(String[] args) {

		int[] arr = { 23, 45, 667, 33, 22, 44653,2222,3332, 223 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			int r = 0;
			while (n > 0) {
				r = n % 10;
				if (r == 2) {
					count++;
				}
				n = n / 10;
			}
		}
		System.out.println(count);
	}

}
