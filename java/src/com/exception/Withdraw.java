package com.exception;

import java.util.Scanner;

public class Withdraw {

	public static void main(String[] args) throws InsufficientBalance {
		Scanner sc = new Scanner(System.in);
		int balance = 5000;
		System.out.println("Enter the amount to withdraw : ");
		int withdraw = sc.nextInt();

		if (withdraw < balance) {
			System.out.println("Withdrawed Successfully  " + (balance - withdraw));
		} else {
			throw new InsufficientBalance();
		}

	}

}
