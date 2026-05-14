package com.oops;

import java.util.Scanner;

//Child Class

public class HomeLoan extends LoanImpl {

	Scanner sc = new Scanner(System.in);

	void getDocInfo() {
		System.out.println("Your All Documents Verified succesfully");
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Home Loan : ");
		HomeLoan h1 = new HomeLoan();
		int cibil = h1.getCibilScore();
		int age = h1.getAge();
		double salary = h1.getSalary();

		if (cibil > 750 && age > 24 && salary > 30000 && h1.getAdhaarDetails() && h1.isValidPan()
				&& h1.isValidPhone()) {
			System.out.println("Your Home Loan got Approved");
			System.out.println("Your Rate Of Interest : " + h1.getROI());
			System.out.println("As Confirming your address details are : ");
			System.out.println(h1.getAddress());
			h1.getDocInfo();
		} else {
			System.out.println("Your Home Loan got Rejected");
		}
	}
}
