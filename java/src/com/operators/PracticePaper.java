package com.operators;

public class PracticePaper {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 4, 5, 7, 8 };

		int target = 20;

		boolean found = false;
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int sum = arr[start] + arr[end];
			if (sum == target) {
				System.out.println("Found : " + arr[start] + " " + arr[end]);
				found = true;
				start++;
				end--;
//				break;
			} else if (sum < target) {
				start++;
			} else {
				end--;
			}

		}

		if (!found) {
			System.out.println("Not Found");
		}

	}
}
