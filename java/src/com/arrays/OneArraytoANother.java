package com.arrays;

public class OneArraytoANother {

	public static void main(String[] args) {

		int[] arr = {23,25,35,56,65};
		int[] arr1 = {34,45,65,65,67};
		int[] arr2 = new int[arr.length + arr1.length];
		
		
		for(int i = 0;i<arr.length;i++) {
			arr2[i] = arr[i];
		}
		for(int i = 0;i<arr1.length;i++) {
			arr2[arr.length + i] = arr1[i];
		}
		
		for(int a : arr2) {
			System.out.print(a + " ");
		}
	}

}
