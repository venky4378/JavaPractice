package com.gut;

import java.util.Arrays;
import java.util.Scanner;

public class MovingNegatives {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		int j = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] < 0) {
				temp =  arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
