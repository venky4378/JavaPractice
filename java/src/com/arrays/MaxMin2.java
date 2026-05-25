package com.arrays;

import java.util.Scanner;

public class MaxMin2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.println("Give the row size: ");
//		int n = sc.nextInt();
//		System.out.println("Give the column size");
//		int m = sc.nextInt();
		int[][] arr = { { 2, 3, 4 }, { 2, 3, 4 } };

		int max = arr[0][0];
		int min = arr[0][0];
		int mincount = 0;
		int maxcount = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					maxcount++;
				} else if (arr[i][j] == max) {
					maxcount++;
				} else if (arr[i][j] < min) {
					min = arr[i][j];
					mincount++;
				} else if (arr[i][j] == min) {
					mincount++;

				}

			}

		}
		System.out.println(max);
		System.out.println(min);
		System.out.println("mincount is " + mincount);
		System.out.println("maxcount is " + maxcount);

	}

}
