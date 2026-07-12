package com.practice;

import java.util.Scanner;

public class VowelsConsonantsCheck {
	
	public static void checkVowelsConsonants(String str) {
		
		String vowels ="";
		String consonants = "";
		
		char[] ch = str.toCharArray();
		
		for(char c: ch) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels = vowels + c + " ";
			}else {
				consonants = consonants + c + " ";
			}
		}
		
		System.out.println("Vowels : "+ vowels);
		System.out.println("Consonants : "+ consonants);
		
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word to check : ");
		String str = sc.nextLine().toLowerCase();
		
		checkVowelsConsonants(str);
		
		
		
	}

}
