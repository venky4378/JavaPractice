package com.oops;

import java.util.Scanner;

//Parent Class or Base Class

public class Loan {
	Scanner sc = new Scanner(System.in);

	String getAddress() {
		String address = null;
		System.out.println("Enter flatNo: ");
		String flatNo = sc.next();
		System.out.println("Enter plot : ");
		sc.nextLine();
		String plot = sc.nextLine();
		System.out.println("Enter your street : ");
		String street = sc.nextLine();
		System.out.println("Enter city : ");
		String city = sc.nextLine();
		System.out.println("Enter pin code : ");
		long pin = sc.nextLong();
		address = "Flot no : " + flatNo + ", plot : " + plot + ", street : " + street + ", City : " + city
				+ ", pincode: " + pin;

		return address;

	}

	public boolean getAdhaarDetails() {
		System.out.println("Enter adhaar : ");
		String adhaar = sc.next();
		return adhaar.matches("\\d{12}");
	}

	public boolean isValidPhone() {
		System.out.println("Enter phone : ");
		String phone = sc.next();
		return phone.matches("[6-9]\\d{9}");
	}

	public boolean isValidPan() {
		System.out.println("Enter pan : ");
		String pan = sc.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
	}

	double getROI() {
		return 10.5;
	}

	int getCibilScore() {
		System.out.println("Enter your Cibil score : ");
		int cibil = sc.nextInt();
		return cibil;
	}

	int getAge() {
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		return age;
	}

	double getSalary() {
		System.out.println("Enter your Salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

}
