package com.arrays;
//
//2.Write a Java program using the Sliding Window Technique to find the maximum sum among all contiguous subarrays of size k in a given array and display the maximum sum.
//Input: arr = {2, 1, 5, 1, 3, 2}, k = 3
//Output: Maximum Sum = 9

public class  TargetEle{

	public static void main(String[] args) {

		int[] arr = {1,3,5,6,7,8,9};
		int target = 9;
		
		int start = 0;
		int end = arr.length-1;
		boolean found = false;
		
		
		while(start<end) {
			int sum = arr[start] + arr[end];
			
			if(sum == target) {
				System.out.println("Found : "+arr[start] + "  "+arr[end]);
				found = true;
				start++;
				end--;
			}else if(sum<target) {
				start++;
				
			}else {
				end--;
			}
		}
		if(!found) {
			System.out.println("Not found");
		}
		
	}

}
