package com.practice;

import java.util.Scanner;

public class StringPalindrome01 {
	
	public static void checkPalindrome(String s) {
		String temp = s;
		String rev = "";
		
		for(int i = s.length()-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		if(s.equals(rev)){
			System.out.println("Palindrome : "+ s);
		}else {
			System.out.println("Not a palindrome");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		
		checkPalindrome(s);
	}

}
