package com.arrays;

public class MaxMin {

	public static void main(String[] args) {
		int[] arr = { 23, 34, 54, 67, 88, -1, -8 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}
}
