package com.arrays;

import java.util.Arrays;

public class TestDemp06 {

	public static void main(String[] args) {

		int[] arr = { 2, 22, 45, 56, 0, 2, 0, 1, 0, 8 };

		int temp;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
