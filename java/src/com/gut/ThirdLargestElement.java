package com.gut;

public class ThirdLargestElement {

	public static void main(String[] args) {

		int[] arr = {-5, -2, -1, -10};		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for(int i = 0;i<arr.length;i++) {
			if((arr[i] > first) ) {
				third = second;
				second = first;
				first = arr[i];
			}else if((arr[i] >second) && (arr[i] != first)) {
				third = second;
				second = arr[i];
			}else if((arr[i] > third)  && (arr[i] < second)) {
				third = arr[i];
			}
		}
		System.out.println("First element : "+ first);
		System.out.println("Second Element : "+ second);
		System.out.println("Third Element : "+third);
	
	}

}
