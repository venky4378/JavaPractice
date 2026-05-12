package com.conditions.loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter where you want to start : ");
		int m =sc.nextInt();
		System.out.println("Enter start number from : ");
		int n = sc.nextInt();
		for(int i = m;i>=n;i--) {
			System.out.println(i);
		}
	}

}
