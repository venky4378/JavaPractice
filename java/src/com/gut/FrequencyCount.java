package com.gut;
//2. Given an array of integers, find the frequency of each element.

//Input: arr = [1, 2, 2, 3, 1, 4, 2]
//Output:
//1 -> 2
//2 -> 3
//3 -> 1
//4 -> 1

public class FrequencyCount {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 1, 4, 2 };

		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (visited[i]) {
				continue;
			}
			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					count++;
					visited[j] = true;
				}
			}
			System.out.println(arr[i] + " " + count);
		}

	}
}
