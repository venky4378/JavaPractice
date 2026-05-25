package com.arrays;

import java.util.Scanner;

public class TwoDtosingle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size");
		int n = sc.nextInt();
		System.out.println("Enter column size");
		int m = sc.nextInt();
		int[][] num = new int[n][m];

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println("Enter values"+i +" "+ j);
				num[i][j] = sc.nextInt();
			}

		}
		for(int i1 = 0;i1<num.length;i1++) {
			for(int j1 = 0;j1<num[i1].length;j1++) {
				System.out.print(num[i1][j1] + " ");
			}
			System.out.println();
			
		}

	}
}
