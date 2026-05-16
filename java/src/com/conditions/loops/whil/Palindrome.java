package com.conditions.loops.whil;

import java.util.Scanner;

public class Palindrome {

	static boolean isPalindrome(int n) {
		boolean status = false;
		int r = 0;
		int rev = 0;
		int temp = n;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = (rev * 10) + r;
		}
		if (rev == temp) {
			return true;
		}

		return status;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check palindrome or not : ");
		int n = sc.nextInt();

		boolean status = isPalindrome(n);

		if (status) {
			System.out.println("The Given Number " + n + " Is Palindrome");
		} else {
			System.out.println("The Given number " + n + " Is not a Palindrome");
		}
		sc.close();

	}

}
