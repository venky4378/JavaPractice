package com.arrays;

//Rotate Arrays 

public class RotateArray01 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int start = 0;
		int end = arr.length - 1;
		int temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for(int i : arr) {
			System.out.print(i);
		}
		
		
	}

}
