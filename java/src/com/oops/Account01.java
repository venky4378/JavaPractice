package com.oops;

import java.util.Scanner;

class ACC {

	public double calculateInterest(double amountCharge) {
		return amountCharge * 0.01;
	}
}

class SavingsAccount01 extends ACC {
	public double calculateInterest(double amountCharge) {
		return amountCharge * 0.03;
	}
}

class CurrentAccount01 extends ACC {

	public double calculateInterest(double amountCharge) {
		return amountCharge * 0.02;
	}
}

public class Account01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the Amount you want : ");
		double amountCharge = sc.nextDouble();

		System.out.println("Give me the account type: ");
		String s = sc.next();

		ACC sa = null; 
		switch (s) {
		case "savings" -> sa = new SavingsAccount01();
		case "current" -> sa =  new CurrentAccount01();
		};

		double interest = sa.calculateInterest(amountCharge);
		System.out.println("Last Charged: " + (amountCharge - interest));
	}
}
