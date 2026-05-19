package com.conditions.loops.whil;

import java.util.Scanner;
//Write a program to print the given number is Armstrong or not 
//Armstrong means the sum of  power of its digits will gives the same value
// means : 153 ->  1^3 + 5^3 + 3^3 = 153   ,  1654  ->  1^4 + 6^4 + 5^4 + 4^4 = 1654


//Enter the Number to check ArmStrong range of Values:
//1000 in this range 
//1 2 3 4 5 6 7 8 9 153 370 371 407
public class ArmstrongRangeOfValues {

	static boolean isArmstrong(int n) {
		boolean status = false;
		int r = 0;
		int temp = n;
		int rev = 0;
		int sum = 0;
		String nstr = "";
		nstr = Integer.toString(n);
		int len = nstr.length();
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
//		boolean status = isArmstrong(n);
		for (int i = 1; i <= n; i++) {
			if (isArmstrong(i)) {
				System.out.print(" " + i);
			}
		}
	}

}
