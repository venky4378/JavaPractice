package com.arrays;

import java.util.Scanner;



public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
//			Reading the inout from scanner by using for loop and storing it into the array
			System.out.println("Enter the number " + i);
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
//			Displlaying array elements
			System.out.print(arr[i] + " ");
		}

	}

}
