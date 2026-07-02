package com.strings;

import java.util.Scanner;

public class PasswordCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter username : ");
//		String userName = sc.next();
//		System.out.println("Enter password : ");
//		String password = sc.next();
//		
//		if(userName.equalsIgnoreCase("admin") && password.equals("admin@123")) {
//			System.out.println("Welcome to the front page");
//		}else {
//			System.out.println("Invalid credintials");
//		}

		System.out.println("Emter word: ");
		String str = sc.next();
		byte[] bytes = str.getBytes();

		char[] ch = str.toCharArray();
		System.out.println("from to charArray");
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

//		for(int i = 0 ;i<bytes.length;i++) {
//			char rev = ((char)bytes[i]);	
//		}

//		getBytes will give the bute values of the given string in a array getByrte() 
//		is the method which gives the array of bytes

		System.out.println();
		System.out.println("-------------------------------");

		for (int i = bytes.length - 1; i >= 0; i--) {
			System.out.print((char) bytes[i]);
		}

	}

}
