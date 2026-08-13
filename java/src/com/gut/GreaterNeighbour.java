package com.gut;

//Java
//1. Find an element that is greater than its neighbors.
//arr = [1, 3, 20, 4, 1, 0]
//Output: 20
//2. I/p :  arr = [1, 0, 2, 3, 1, 5]
//O/p : 1,3,5

public class GreaterNeighbour {

	public static void main(String[] args) {

		int[] arr = {1, 3, 20, 4, 1, 0};

		if (arr[0] > arr[1]) {
			System.out.print(arr[0] + " ");
		}
		for (int i = 1; i < arr.length - 1; i++) {
			if ((arr[i] > arr[i - 1]) && (arr[i] > arr[i + 1])) {
				System.out.print(arr[i] + " ");
			}

		}
		if (arr[arr.length - 1] > arr[arr.length - 2]) {
			System.out.print(arr[arr.length - 1] + " ");
		}
	}
}
