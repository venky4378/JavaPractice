package com.gut;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int k = 2;
		reverseArray(arr,k);
	}
	public static void reverseArray(int[] arr,int k) {
		int start = 0;
		int end = arr.length-1;
		rotate(arr,start,end);
		rotate(arr,start,k-1);
		rotate(arr,k,end);
		
		System.out.println(Arrays.toString(arr));
}
	public static void rotate(int[] arr,int start, int end) {
		int temp = 0;
		while(start<end) {
			temp =  arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
