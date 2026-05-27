package com.arrays;

public class Optimizedbubble {

	public static void main(String[] args) {
		
		
		int[] arr = {12,23,3,4,45,23,23};
		boolean status;
		int temp;
		
		for(int i = 0;i<arr.length-1;i++) {
			status = false;
			for(int j = 0;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					status = true;
				}
			}if(!status) {
				break;
			}
		}
		for(int i : arr) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//
//		int[] arr = {1,2,33,556,778,33,22,1,4};
//		int temp = 0;
//		boolean status = false;
//		
//		for(int i = 0;i<arr.length;i++) {
//			status =false;
//			for(int j = 0;j<arr.length-1-i;j++) {
//				if(arr[j]>arr[j+1]) {
//					temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					status = true;
//				}
//			}if(!status) {
//				break;
//		}
//		
//		}
//		for(int i : arr) {
//			System.out.print(i + " ");
//			
//		}
		
	}

}
