package com.conditions.loops.whil;

import java.util.Scanner;

public class DectoBinary {
	static void dectobin(int n) {
		int r = 0;
		String sum = " ";
		while (n > 0) {
			r = n % 2;
			n = n / 2;
			sum = r + " " + sum;
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();

		dectobin(n);

	}

}
