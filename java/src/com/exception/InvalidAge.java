package com.exception;

import java.util.Scanner;

public class InvalidAge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		if(age>18) {
			System.out.println("You are Elegible for Voting");
		}else {
			
		}
		
	}

}
