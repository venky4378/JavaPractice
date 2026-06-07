package com.arrays;

public class TestDemo03 {

	public static void main(String[] args) {
		int[] arr = { 1, 24, 4, 56, 3, 1, 2, 35, 5, 1 ,2};

		int value;
		int duplicate = 0;

		for (int i = 0; i < arr.length; i++) {
			value = arr[i];

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == value) {
					duplicate = arr[j];
					System.out.print(duplicate + " ");
					break;
				}
				
			}
			
		}
		
	}

}
