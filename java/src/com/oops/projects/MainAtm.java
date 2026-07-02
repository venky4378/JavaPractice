package com.oops.projects;

import java.util.Scanner;

public class MainAtm {

	public static void main(String[] args) {

		User[] u1 = new User[4];
		u1[0] = new User(12345, 123456.00, "sdfghj", 8765);
		u1[1] = new User(23456, 890000.00, "kjnsca", 9876);
		u1[2] = new User(34567, 890000.00, "ksdnvjs", 8765);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the acc no");
		int accno1 = sc.nextInt();
		System.out.println("Enter the pin : ");
		int pin = sc.nextInt();

		User u = null;
		boolean status = false;

		for (User u2 : u1) {
			if (accno1 == u2.getAccno() && pin == u2.getPin()) {
				status = true;
				u = u2;

				break;

			}
		}
		System.out.println("Welcome to the  Atm");


		while (status) {
			System.out.println("1.Check the Balance\n2.Deposit\n3.withdraw the cash\n4.pin change\n5.Exit -Back to home");

			System.out.println("Choose the option number : ");
			int n = sc.nextInt();
			Atmimpl a = new Atmimpl(u);

			switch (n) {
			case 1 -> a.checkBalance();
			case 2 -> a.deposit();
			case 3 -> a.withdraw();
			case 4 -> a.pinchange();
			case 5 -> {
				status = false;
				System.out.println("thanks for using sbi services");

			}

			}
		}
		System.out.println("Invalid details");

	}

}
