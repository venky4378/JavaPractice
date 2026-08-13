
package com.gut;

public class MissingNumber {
	public static void main(String[] art) {
		int arr[]= {-2,0,3,5};
		int max = arr[arr.length-1];
		missing(arr,max);
		}
	public static void missing(int[] arr,int max) {
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] != i) {
				System.out.println(	i);
			}
		}
	}


}
