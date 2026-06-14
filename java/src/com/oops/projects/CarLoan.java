package com.oops.projects;

import java.util.Scanner;

//Child class

public class CarLoan extends LoanImpl {

	Scanner sc = new Scanner(System.in);

	void getDocInfo() {
		System.out.println("Your All Documents  for Car Loan Verified succesfully");
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Car Loan : ");
		CarLoan c1 = new CarLoan();
		int cibil = c1.getCibilScore();
		int age = c1.getAge();
		double salary = c1.getSalary();

		if (cibil > 700 && age > 21 && salary > 25000 && c1.getAdhaarDetails() && c1.isValidPan()
				&& c1.isValidPhone()) {
			System.out.println("Your Car Loan got Approved");
			System.out.println("Your Rate Of Interest : " + c1.getROI());
			System.out.println("As Confirming your address details are : ");
			System.out.println(c1.getAddress());
			c1.getDocInfo();
		} else {
			System.out.println("Your Car Loan got Rejected");
		}
	}
}
