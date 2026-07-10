package com.gut;

public class SecondLargest01 {

	public static void main(String[] args) {

		int[] arr = {12,45,67,23,89,54};
		int second = arr[0];
		int first = arr[0];
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > first) {
				second = first;
				first = arr[i];
			}else if((arr[i] > second) && (arr[i]!=first)) {
				second = arr[i];
			}
		}
		
		System.out.println("First : "+ first);
		System.out.println("Second : "+ second);
	}

}
