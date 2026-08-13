package com.practice;

public class TargetSum {
	static void main() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int target = 10;

		int start = 0;
		int end = arr.length - 1;

		boolean status = false;

		while (start < end) {

			int sum = arr[start] + arr[end];

			if (sum == target) {
//				System.out.println(start + " & "+ end);
				status = true;
				start++;
				end--;
			} else if (sum < target) {
				start++;
			} else if (sum > target) {
				end--;
			}

			if (status) {
				System.out.println("Pair found at : "+start + " & " + end);
			}

		}

	}

}
