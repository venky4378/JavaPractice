package com.practice;

import java.util.Arrays;

public class Practice03 {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3,5, 1, 2 };

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			  
			while(j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
		
		System.out.println(Arrays.toString(arr));

	}
}
