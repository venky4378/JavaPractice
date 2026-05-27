package com.conditions.loops;

import java.util.Scanner;

public class RandomOtp {

	public static void main(String[] args) {

		int otp = (int) ((Math.random() * 900000) + 100000);
		System.out.println(otp);
		
		System.out.println("Enter value");
		Scanner sc = new Scanner(System.in);
		int enterOTP = sc.nextInt();
		if (enterOTP == otp) {
			System.out.println("You logined Successfully");
		} else {
			System.out.println("Try again");
		}
	}

}
