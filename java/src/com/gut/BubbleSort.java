package com.gut;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 22, 34, 83, 12, 23, 57 };

		int temp = 0;
		int length = arr.length;
		boolean flag;
		int count = 0;

		for (int i = 0; i < length - 1; i++) {
			flag = false;
			for (int j = 0; j < length - 1 - i; j++) {
				count++;

				if (arr[j + 1] < arr[j]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}

		System.out.println("Sorted Array: " + Arrays.toString(arr));
		System.out.println(count);
	}

}
