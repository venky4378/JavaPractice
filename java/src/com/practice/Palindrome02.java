package com.practice;

import java.util.Scanner;

public class Palindrome02 {

	public static boolean isPalindrome(String str) {

		String temp = str;
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			result = str.charAt(i) + result;
		}
		if (result.equals(temp)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		System.out.println("Give me a String to check Palindrome or not: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if (isPalindrome(str)) {
			System.out.println(str + " the given is palindrome");
		}else {
			System.out.println(str + " Not a palindrome");
		}

	}
}
