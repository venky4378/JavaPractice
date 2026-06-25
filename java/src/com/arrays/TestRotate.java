package com.arrays;

import java.util.Scanner;
import java.util.Arrays;

//Left rotate array by 1
//i/p  Left Rotate by Array by 1
//o/p  2,3,4,5,1
public class TestRotate {
	
	public static void rotate(int[] arr,int r1){
		int start = 0;
		int end = arr.length-1;
		int r = r1-1;
		isRotate(arr,start,end);
		isRotate(arr,start,r);
		isRotate(arr,r,end);
	}
	
	public static void isRotate(int[] arr,int start,int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;		
			start++;
			end--;
		}
		System.out.println(Arrays.toArray(arr));	
	}
	
	public static void isRotate(int start,int end) {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		int r = sc.nextInt();
		
		rotate(arr,r);
		
		
	}

}
