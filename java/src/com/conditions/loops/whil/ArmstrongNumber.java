package com.conditions.loops.whil;

import java.util.Scanner;

public class ArmstrongNumber {
	
	boolean isArmstrong(int n){
		boolean status = false;
		int r = 0;
		int temp = n;
		int rev = 0;
		
		
		while(n>0) {
		r = n % 10;
		n = n / 10;
//		rev = (int) ((rev * 10);
		}
		
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check ArmStrong : ");
		boolean  status = isArmstrong(n);
		
		if(status) {
			System.out.println("The Given number is Armstrong");
		}else {
			System.out.println("The given number is not an Armstrong number");
		}
	}

}
