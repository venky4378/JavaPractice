package com.arrays;

public class CopyArray {

	public static void main(String[] args) {

		int[] arr = { 12, 23, 3, 45, 6, 65, 33 };

		int[] arr1 = new int[7];

		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
			}
			for(int i : arr1) {
				System.out.print(i + " ");
		}

	}

}
