package com.conditions.loops.whil;

import java.util.Scanner;

//To print the the reverse of a given number

public class ReverseNumber {

	static int revNum(int n) { ///356
		int r = 0;
		int sum = 0;

		while (n > 0) {
			r = n % 10; // 6
			n = n / 10; // 35
			sum = (sum * 10) + r; // it will give calculate the r * 10 first
//											iterate 6 and then *10 = 65 and then r8 10 means 653
		}

		return sum;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number that wants to reverse : ");
		int n = sc.nextInt();
		int reverse = revNum(n);
		System.out.println("Reverse Number : " + reverse);
		sc.close();
	}

}
