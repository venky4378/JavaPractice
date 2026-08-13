package com.gut;

import java.util.Arrays;

public class MaxMin {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		var start = 0;
		var end = arr.length - 1;
		int index = 0;
		int[] result = new int[arr.length];                         
		while (start <= end) {
			result[index++] = arr[end];
			end--;
			if (start <= end) {
				result[index++] = arr[start];
				start++;
			}
		}
		System.out.println(Arrays.toString(result));
	}
}