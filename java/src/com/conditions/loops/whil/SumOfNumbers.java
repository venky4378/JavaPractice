package com.conditions.loops.whil;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 0;

		int count = 0;
		while(n != 0) {
			
			r = n % 10;
			n = n/10;
			
			count = count +  r;
			
		}
		System.out.println(count);
	}

}
