package com.arrays;

public class MissingNumber {

	public static void main(String[] args) {

		
		int[] arr = {1,2,3,4,5,6,7,9};
		
		int n = 9;
		int actualSum = 0;
		int expectSum = (n * (n+1))/2;
		
		for(int  i = 0;i<arr.length;i++) {
			actualSum = actualSum + arr[i];
		}
		
		int missing  = expectSum - actualSum;
		System.out.println(missing);
	}
	
}
