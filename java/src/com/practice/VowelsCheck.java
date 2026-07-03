package com.practice;

import java.util.Scanner;

public class VowelsCheck {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        String ch = sc.next().toLowerCase().charAt(0);
	        char[] c = ch.toCharArray();
for(char c1:c) {
	        if(c1 == 'a' || 'e' || 'i' || 'o' || 'u'){
	            System.out.println(ch + "is a vowel");
	        }else{
	            System.out.println(ch + "is not a vowel");
	        }
}
	}

}
