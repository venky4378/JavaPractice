package com.arrays;
//Reversing the Array and also Rotating the Arrays also
import java.util.Scanner;

public class RotateArraynTimes {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int r = sc.nextInt();

		isRotate(arr, r);
		for (int i : arr) {
			System.out.print(i);
		}

	}

	static void isRotate(int[] arr, int r) {
		int start = 0;
		int end = arr.length - 1;

		isReverse(arr, start, end);
		isReverse(arr, start, r - 1);
		isReverse(arr, r, end);

	}

	static void isReverse(int[] arr, int start, int end) {

		int temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
