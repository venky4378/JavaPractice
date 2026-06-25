package com.practice;

import java.util.Scanner;

public class VowelsCheck {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        String ch = sc.next().toLowerCase().charAt(0);
	        char[] c = ch.toCharArray();

	        if(ch == 'a' || 'e' || 'i' || 'o' || 'u'){
	            System.out.println(ch1 + "is a vowel");
	        }else{
	            System.out.println(ch1 + "is not a vowel");
	        }

	}

}
