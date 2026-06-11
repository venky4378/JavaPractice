package com.arrays;

import java.util.Scanner;

public class StarPatterns04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
			for(int j1 = i;j1<=i;j1++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k = 1;k<=n;k++) {
			for(int l = 1;l<=k;l++) {
				System.out.print("*");
			}
		System.out.println();
	
	}
}
}
