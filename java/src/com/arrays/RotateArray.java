package com.arrays;

import java.util.Scanner;

public class RotateArray {

	static void reversedArray(int[] arr, int start, int end) {
		int temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}
		
		for(int a:arr) {
			System.out.print(a + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 12, 14, 15, 16, 17, 18 };

		System.out.println("Enter the r you want to rotate ");
		int r = sc.nextInt();
		int start = 0;
		int end = arr.length - 1;

		reversedArray(arr, start, end);
		reversedArray(arr, start, r-1);
		reversedArray(arr, r-1, end);

	}

}
