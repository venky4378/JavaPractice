package com.conditions.loops;

import java.util.Scanner;

public class FabonacciNum5to50 {
//write a fabonacci series from 5 to 50
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the range of numbers");
		int n = sc.nextInt();
		
//		int n1 = 0;
//		int n2 = 1;
		
		int n1 = 5;
		int n2 = 8;
		System.out.print(n2+" ");
		for(int i = 1;i<=n;i++) {
			int n3  = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}

		sc.close();
	}


}
