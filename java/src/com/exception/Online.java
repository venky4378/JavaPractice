package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Online {
	//static int length1;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		try {
			String name =null;
			int length1 = name.length();
			
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("Enter age:");
			int age = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
		
		try {
			int TotalMarks = 100;
			System.out.println("Enter subjects");
			int subjects = sc.nextInt();
			int avg = TotalMarks/subjects;
			
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		
		try {
			int[] arr = {1,2,3};
			System.out.println("Enter the size");
			int n = sc.nextInt();
			int m = arr[n];
			for(int i = 0;i<m;i++) {
				System.out.print(arr[i]);
			}
		}catch(IndexOutOfBoundsException ie) {
			System.out.println(ie);
		}
		
		
		
	}

}
