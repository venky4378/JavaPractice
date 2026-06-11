package com.arrays;

import java.util.Arrays;

public class MergeSortTest02 {

	public static void main(String[] args) {

		int[] arr = {8,7,6,5,4,3,2};
		
		divide(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void divide(int[] arr) {
		int[] left = new int[arr.length / 2];
		int[] right = new int[arr.length - left.length];
		
		if(arr.length<=1) {
			return;
		}
		int i;
		for(i = 0;i<left.length;i++) {
			left[i] = arr[i];
		}
		for(int j= 0;j<right.length;j++) {
			left[j] = arr[i]; 
		}
		
		divide(left);
		divide(right);
		
	}
	

}
