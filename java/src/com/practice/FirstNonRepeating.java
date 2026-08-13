package com.practice;

public class FirstNonRepeating {
	
	public static void main(String[] args) {
		
		int[] arr = {1,32, 1, 2, 3, 4, 5, 6, 6, 7, 7, 3 };

		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if ((arr[i] == arr[j]) && (i != j)) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
