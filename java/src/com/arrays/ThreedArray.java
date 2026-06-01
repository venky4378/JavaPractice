package com.arrays;

public class ThreedArray {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4 }, 
					    { 5, 6, 7, 8 },
					    { 9, 10, 11, 12 },
					    { 13, 14, 15, 16 } };

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				int start = 0;
				int end = arr[i].length - 1;
				int temp;
				while (start < end) {
					temp = arr[i][start];
					arr[i][start] = arr[i][end];
					arr[i][end] = temp;
					start++;
					end--;
				}

			} else if (i % 2 != 0) {
				for (int j = 0; j < arr.length; j++) {
					if (i != j) {
						arr[i][j] += arr[i][j];

					}
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i][i] *= 2;
		    arr[i][arr.length - 1 - i] *= 2;     // secondary diagonal

		}


		for (int[] a : arr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

	}
}
