package com.arrays;

//Optimized better performance bubble sort with big (O(n)) if we don't use boolean and 
//condition like  if(!status and break the loop then we got big(O(n^2))
//

public class TestBubble02 {

	public static void main(String[] args) {

		int[] arr = { 23, 34, 5, 6, 6778, 886, 44, 3332 };
		int temp;
		int count = 0;
		int count1 = 0;

		for (int i = 0; i < arr.length; i++) {
			count++;
			boolean status = false;
			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count1++;
					status = true;
				}

			}
			if (!status) {
				break;
			}

		}
		for (int i1 : arr) {
			System.out.print(i1 + " ");
		}
		System.out.println();
		System.out.println(count);
		System.out.println(count1);
	}

}
