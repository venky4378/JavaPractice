package com.conditions;

import java.util.Scanner;

public class SpecialCharacters {
	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value : ");
		String s = sc.next();
		char ch = s.charAt(0);
		
		if(((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z'))){
			System.out.println("Alphabet" + ch);
		}else if(ch>='0' && ch<='9') {
			System.out.println("Number : "+ch);
		}else {
			System.out.println("Special Character : "+ch);
		}
	}
}
