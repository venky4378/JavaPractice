package com.strings;

import java.util.Scanner;

public class StringDemo04 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter phone Number: ");
//		String phone = sc.next();
//		
//		boolean bh = phone.matches("^[6-9]{1}[0-9]{9}$");
//		System.out.println(bh);
//		System.out.println("----------------------");
//		System.out.println("Enter PAN Details : ");
//		String pan = sc.next().toUpperCase();
//		boolean panMathes = pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}$");
//		System.out.println(panMathes);
//		
		//TRIM method
		
		String sen = "      Java   is    simple    ";
		sen = sen.trim();
		System.out.println(sen);
		System.out.println(sen);
		
		String sen1 = "      Java   is    simple    ";
		sen1 = sen.replaceAll("\\s", "");
		System.out.println(sen1);
		
		
		
		
	}

}
