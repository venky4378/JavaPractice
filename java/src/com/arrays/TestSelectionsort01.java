package com.arrays;
import java.util.Arrays;

public class TestSelectionsort01{
	
	
	public static void main(String[] args) {
		int[] arr = {10,20,50,77,99,23,345,3};
		
		int temp = 0;
		for(int i = 0;i<arr.length;i++) {
			int minIndex = i;
			
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j] > arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
