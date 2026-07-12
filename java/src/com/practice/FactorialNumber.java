package com.practice;

import java.util.Scanner;

public class FactorialNumber {
	public static void factorial(int n) {
		
		int sum = 1;
		for(int i = 1;i<=n;i++) {
			sum = sum *i;
			System.out.print(sum + " ");

		}
				
	}
	
	public static void main(String[] arfs) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		factorial(n);
	}

}
