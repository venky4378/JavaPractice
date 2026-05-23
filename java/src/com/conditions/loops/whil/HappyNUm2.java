package com.conditions.loops.whil;

import java.util.Scanner;

public class HappyNUm2 {

	static boolean isHappy(int n) {
		boolean status = false;
		int r = 0;
		int sum = 0;
		int temp = n;

		while (n != 1 && n != 4) {
			while (n > 0) {
				r = n % 10;
				n = n/10;
				sum = (int)(sum+ Math.pow(r, 2));
			}n = sum;
		}if(sum == 1) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		boolean status = isHappy(n);
		if(status) {
			System.out.println("Is happy");
		}else {
			System.out.println("Not happy");
		}
	}

}
