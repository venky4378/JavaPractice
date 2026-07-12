package com.practice;

import java.util.Scanner;

public class VowelsCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String ch = sc.nextLine().toLowerCase();
		char[] c = ch.toCharArray();
		String vowels="";
		String consonants = "";
		
		for (char c1 : c) {
			if (c1 == 'a' || c1 == 'e' || c1 == 'i' ||c1 ==  'o' || c1 == 'u') {
				vowels = vowels + c1 + " ";
			} else {
				consonants = consonants + c1 + " ";
			}
		}
		System.out.println("vowels are: "+vowels);
		System.out.println("Cosonants are: "+consonants);
		sc.close();
	}

}
