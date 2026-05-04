package com.oops;

import java.util.Scanner;

//Child class

public class PersonalLoan extends Loan {
	Scanner sc = new Scanner(System.in);

	void getDocInfo() {
		System.out.println("Your All Documents Verified succesfully");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Personal Loan : ");
		PersonalLoan p1 = new PersonalLoan();
		int cibil = p1.getCibilScore();
		int age = p1.getAge();
		double salary = p1.getSalary();

		if (cibil > 750 && age > 24 && salary > 30000 && p1.getAdhaarDetails() && p1.isValidPan()
				&& p1.isValidPhone()) {
			System.out.println("Your Personal Loan got Approved");
			System.out.println("Your Rate Of Interest : " + p1.getROI());
			System.out.println("As Confirming your address details for Personal Loan : ");
			System.out.println(p1.getAddress());
			p1.getDocInfo();
		} else {
			System.out.println("Your Personal Loan got Rejected");
		}
	}
}
