package com.strings;

public class SlidingExample{
	
	public static void main(String[] args) {
		
		String str = "Madam";
		
		String reverse = "";
		
		for(int i = 0;i<str.length();i++) {
			reverse = str.charAt(i) + reverse;
		}
		
		System.out.println(reverse);

	}
}