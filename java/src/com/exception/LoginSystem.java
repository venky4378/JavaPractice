package com.exception;

import java.util.Scanner;

public class LoginSystem {
	public static void main(String[] args) throws InvalidCredentials {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String studentName = sc.next();
		System.out.println("Enter the password : ");
		String studentPassword = sc.next();
		
		if(studentName.equals("admin") && studentPassword.equals("123")) {
			System.out.println("Loginned Successfully");
		}else {
			throw new InvalidCredentials("Something went wrong");
			}
	
	}

}
