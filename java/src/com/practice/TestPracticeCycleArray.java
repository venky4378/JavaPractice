package com.practice;

import java.util.Arrays;

public class TestPracticeCycleArray {

	public static void main(String[] args) {

		int[] arr = {5,2,10,8};
		int len = arr.length;

		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			result[i] = -1;
		}

		for (int i = 0; i < len; i++) {
			for (int j = 1; j < len; j++) {
				int next = (i + j) % len;

				if (arr[next] > arr[i]) {
					result[i] = arr[next];
					break;
				}
			}

		}
		System.out.println(Arrays.toString(result));

	}

}
