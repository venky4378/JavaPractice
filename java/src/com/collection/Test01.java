package com.collection;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int[] arr = {4,1,5,3,2,1};
		int n = arr.length;
		
		int[] result = new int[arr.length];
		
		for(int i = 0 ;i<n;i++) {
			result[i] = -1;
			
			for(int step = 1;step<n;step++) {
				int j = (i+step) % n;
				if(arr[j]>arr[i]) {
					result[i] = arr[j];
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(result));
		for(int a: result) {
			System.out.print(a + " ");
		}
	}

}
