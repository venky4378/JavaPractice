package com.exception;

//.Create a custom exception named WeakPasswordException.
//Write a Java program to validate a user's password using Regular Expressions (Regex).
//The password must satisfy the following conditions:
//Password length must be at least 8 characters.
//Password must contain at least one digit (0-9).
//If any condition is not satisfied, throw a custom exception WeakPasswordException with an appropriate message.
//Otherwise, display:

//
//^ → start of string
//(?=.*\\d) → must contain at least one digit
//.{8,} → any characters, minimum length 8
//$ → end of string


import java.util.Scanner;


public class PasswordHandling {

	public static void main(String[] args) throws WeakPasswordException{
		
		
		Scanner sc = new Scanner(System.in);	
		String password = "^(?=.*\\d).{8,}$";	
		System.out.println("Enter the Password");
		String userPassword = sc.next();

		if(userPassword.matches(password) ) {
			System.out.println("Strong Password set succeffuly");
		}else {
			throw new WeakPasswordException("WeakPassword");
		}
		
		
		
	}

}
