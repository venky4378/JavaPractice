package com.arrays;

public class Target02 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,4,6,7,8,9};
		int target = 20;
		int start = 0;
		int end  = arr.length-1;
		
		boolean found = false;
		
		while(start<end) {
			int sum = arr[start] + arr[end];
			
			if(sum == target) {
				System.out.println("Found : "+ arr[start] + " "+ arr[end]);
				found =true;
				break;
			}
			
			else if(sum<target) {
				start++;
			}else {
				end--;
			}
			
		}
		if(!found) {
			System.out.println("No pair found");
		}
	}

}
