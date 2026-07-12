package com.practice;
import java.util.Scanner;

class Palindrome{
	public static boolean isPalindrome(int n) {
		boolean status = false;
		int r = 0;
		int rev = 0;
		int temp = n;
		while(n>0) {
			r = n% 10;
			n = n/10;
			rev = (rev*10) + r;
		}
		if(rev == temp) {
			return true;	
		}	
		System.err.println(status);
		return status;
	}
	public static void main(String[] venky) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int n = sc.nextInt();
		boolean flag = isPalindrome(n);
		if(flag) {
			System.out.println("The given number is Palindrome : " + n);
		}else {
			System.out.println("The Given number is not a Palindrome :" + n);
		}
	}
}