package com.arrays;

public class TestArr5 {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60 };

		int[] arr1 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				arr1[i] = arr[i] + arr[i + 1];
			} else if (i == arr.length - 1) {
				arr1[i] = arr[i] + arr[i - 1];
			} else {
				arr1[i] = arr[i + 1] + arr[i - 1];
			}
		}
		for (int a : arr1) {
			System.out.print(a + " ");
		}
	}

}
