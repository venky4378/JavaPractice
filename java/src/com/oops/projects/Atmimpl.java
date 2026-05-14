package com.oops.projects;

import java.util.Scanner;

public class Atmimpl implements Atm {
	User u;

	Atmimpl(User u1) {
		u = u1;
	}

	Scanner sc = new Scanner(System.in);

	@Override
	public void checkBalance() {
		double balance = u.getBalance();
		System.out.println("Your balance is: " + balance);
	}

	@Override
	public void deposit() {
		System.out.println("Enter how much cash you want to deposit : ");
		double depo = sc.nextDouble();
		depo = u.getBalance() + depo;
		u.setBalance(depo);
		System.out.println("Delopsited successfully");

	}

	@Override
	public void withdraw() {
		System.out.println("Enter the amount you want : ");
		int cash = sc.nextInt();
		if (cash < u.getBalance()) {
			cash = (int) (u.getBalance() - cash);
			u.setBalance(cash);
			System.out.println("Withdrawl succesfully ");
		}

	}

	@Override
	public void pinchange() {
		System.out.println("Enter Old pin : ");
		int oldPin = sc.nextInt();
		if (oldPin == u.getPin()) {
			System.out.println("Enter new pin : ");
			int newPin = sc.nextInt();
			u.setPin(newPin);
			System.out.println("Pin set Successfully");

		}

	}
}
