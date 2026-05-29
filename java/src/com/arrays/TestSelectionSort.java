package com.arrays;

public class TestSelectionSort {

	public static void main(String[] args) {
		int temp = 0;
		int count = 0;

		int[] arr = { 22, 456, 67, 33, 22, 45, 67, 87, 12, 21, 12, 11, 23, 3, 2, 1 };
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					temp = arr[j];
					arr[j] = arr[minIndex];
					arr[minIndex] = temp;
					count++;

				}

			}

		}

		for (int i1 : arr) {
			System.out.print(i1 + " ");
		}
		

	}

}
