package com.conditions.loops.whil;

import java.util.Scanner;
//Write a program to print the given number is Armstrong or not 
//Armstrong means the sum of  power of its digits will gives the same value
// means : 153 ->  1^3 + 5^3 + 3^3 = 153   ,  1654  ->  1^4 + 6^4 + 5^4 + 4^4 = 1654

public class ArmstrongNumber {

	static boolean isArmstrong(int n) {
		boolean status = false;
		int r = 0;
		int temp = n;
		int rev = 0;
		int sum = 0;
		String nstr = "";
		nstr = Integer.toString(n);
		int len = nstr.length();
		System.out.println(len);

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = (int) (sum + Math.pow(r, len));
		}
		if (sum == temp) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check ArmStrong : ");
		int n = sc.nextInt();
		boolean status = isArmstrong(n);
		if (status) {
			System.out.println("Is Armstrong");
		} else {
			System.out.println("Not a Armstrong");
		}
	}

}
