package com.arrays;

import java.util.Scanner;

//Count Occurrences: Given an array and a target number $X$,
//count how many times $X$ appears in the array.

public class CountOfElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n = sc.nextInt();
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 5;
		arr[2] = 5;
		arr[3] = 5;
		arr[4] = 5;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				count++;
			}

		}System.out.println(count);


	}

}
