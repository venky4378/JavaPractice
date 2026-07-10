package com.gut;

import java.util.Arrays;

//2. Given an array, move all zeros to the end while maintaining the order of non-zero elements.
//arr = [0, 1, 0, 3, 12]
//Output:
//[1, 3, 12, 0, 0]
//Constraint:
//In-place solution preferred
//Time Complexity: O(n)

public class MvingZeros {
	
	public static void main(String[] args) {
		int arr[] = {0,1,0,3,12};
		int temp = 0;
		int j = 0;
		
		for(int  i = 0;i<arr.length;i++) {
			if(arr[i] != 0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
