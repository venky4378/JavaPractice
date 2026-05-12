package com.conditions.loops;

import java.util.Scanner;

public class MultiplicationTable {

	static void multiplyTable(int n, int m) {

		for (int i = 1; i <= m; i++) {
			System.out.println(n +" "+ "x" +" "+ i +" "+ "=" +" "+ (n * i));
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter table number: ");
		int n = sc.nextInt();
		System.out.println("Enter range to multiply: ");
		int m = sc.nextInt();
		
		multiplyTable(n, m);

	}

}
