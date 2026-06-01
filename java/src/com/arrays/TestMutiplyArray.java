package com.arrays;


//shifting the zeros 0's to left of the array
public class TestMutiplyArray {

	public static void main(String[] args) {
		int[] arr = { 2, 0, 5, 0,3, 9, 0, 1 };
		int num = 0;
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] == num) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}
		for (int i1 : arr) {
			System.out.print(i1 + " ");
		}
	}

}
