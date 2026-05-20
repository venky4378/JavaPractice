package com.conditions.loops;

import java.util.Scanner;

public class BintoDec {

	static void bintoDec(int n) {
		int r = 0;
		int sum = 0;
		int power = 1;

		while (n > 0) {
			r = n % 10;
			sum += r * power;
			power = power * 2;
//			sum = (int) (sum + Math.pow(r, power));
			n /= 10;
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();

		bintoDec(n);

	}

}
