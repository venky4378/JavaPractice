package com.conditions.loops;

import java.util.Arrays;
import java.util.Scanner;

public class TestDemo02 {


	static void isReverse(int[] arr,int start,int end){

		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		

		
		makeRotate(arr,start,end);
		makeRotate(arr,r,end);
		
		System.out.println(Arrays.toString(arr));
		

		
		
	}

	public static void makeRotate(int[] arr, int r, int end) {

	}

	public static void main(String[] args) {
		System.out.println("Give r value: ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int[] arr = { 5, 4, 3, 2, 1 };
		int start = 0;
		int end = arr.length - 1;

		
		isReverse(arr, r, end);

	}

}
