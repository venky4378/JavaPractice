package com.arrays;

import java.util.Arrays;

public class TestDemo01 {

	public static void main(String[] args) {

		int[] arr = {1,2,5,7,9,0,0,453,567,0,23,1,0,3,6};
		
		int j = 0;
		int temp;
		
		for(int i = 0;i<arr.length;i++) {
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
