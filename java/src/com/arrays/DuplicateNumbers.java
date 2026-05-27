package com.arrays;

//Write a program to find duplicate numbers in a array

public class DuplicateNumbers {

	public static void main(String[] args) {

//		String[] names = {"Mango","Banana","Apple","Grapes","Mango","Banana"};
//		
//		for(int i = 0;i<names.length;i++) {
//			for(int j = 0;j<names[i].length;j++) {
//				
		int[] arr = { 7, 8, 10, 8, 5, 4, 7 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}

			}
		}

	}

}
