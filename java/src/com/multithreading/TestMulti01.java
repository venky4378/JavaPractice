package com.multithreading;

import java.util.Scanner;

//1.Write a java program using the Runnable interface to create 3 threads 
//that print employee names, emp IDs, and emp salaries. Start all 3 threads simulatneously and display the output.

class TestMulti02 implements Runnable {

	public void run() {

		System.out.println("Swamy");
		System.out.println("Venky");
		System.out.println("Swamy1");
		System.out.println("Swamy2");
		System.out.println("Swamy3");
		System.out.println("Swamy4");
	}
}

class Ids implements Runnable {
	public void run() {
		System.out.println("11");
		System.out.println("12");
		System.out.println("13");
		System.out.println("14");
		System.out.println("15");
		System.out.println("16");
	}
}

class Salary implements Runnable {

	public void run() {
		System.out.println(150000);
		System.out.println(12000.00);
		System.out.println(56000.0);
		System.out.println(67000.00);
		System.out.println(34000.00);
		System.out.println(56000.00);
	}
}

public class TestMulti01 implements Runnable {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter names of the employee: ");
//		String names = sc.next();
//		System.out.println("Enter the id of the employee: ");
//		int eid = sc.nextInt();
//		System.out.println("Enter the salary of the employee: ");
//		double salary = sc.nextDouble();

		TestMulti01 t1 = new TestMulti01();
		Thread t = new Thread(t1);
		t.start();

		TestMulti02 t2 = new TestMulti02();
		Thread t3 = new Thread(t2);
		t3.start();

		Ids t4 = new Ids();
		Thread t5 = new Thread(t4);
		t5.start();
		
		Salary t6 = new Salary();
		Thread t7 = new Thread(t6);
		t7.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
	}


