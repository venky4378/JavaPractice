package com.conditions;

import java.util.Arrays;

public class Test04 {
	
	public static void main(String[] args) {
		int[] arr = {1,-3,-2,-5,2,3,4,6};
		
		int n = arr.length-1;
		int temp;
		for(int i = 1;i<n;i++) {
			if(arr[i]<0) {
				temp = arr[i];
				arr[i]=arr[i-1];
				arr[i-1] = temp;
			}
		}System.out.println(Arrays.toString(arr));
	}

}
