package com.collection;

import java.util.Arrays;

public class NextGreaterElementTest {

	public static void main(String[] args) {

		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 1;
		int[] arr2 = new int[arr.length];
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = (i + 1)%arr.length; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					arr2[i] = arr[j];
//				} else {
//					arr2[i] = -1;
//				}
//			}
//		}
		
		
		for (int i = 0; i < arr.length; i++) {
		    for (int step = 1; step < arr.length; step++) {
		        int j = (i + 1)% arr.length;
		        System.out.println("i=" + i + " j=" + j);
		    }
		}
//		System.out.println(Arrays.toString(arr2));

	}

}
