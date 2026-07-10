package com.gut;

import java.util.Arrays;

//1. Given an array of integers, find the smallest element in the array.
//arr = [12, 45, 67, 23, 89, 34]
//Output:
//12
//Traverse the array only once
//Time Complexity: O(n)

public class SmallestElement {
	public static void main(String[] args) {
		int[] arr= {12,45,67,23,89,34};
	
		int small = arr[0];
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]<small) {
				small = arr[i];
			}
		}
		System.out.println(small);
		
		
	}

}
