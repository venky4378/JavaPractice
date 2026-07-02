package com.strings;

public class TestDemo07 {

	public static void main(String[] args) {

		String ch = "Mahesh";

		String  rev="";
		for (int i = 0; i < ch.length(); i++) {
			rev = ch.charAt(i) + rev;

		} 
		System.out.println(rev);
		
		System.out.println(ch.codePointCount(1,5));
		System.out.println(ch.codePointAt(4));
		
		System.out.println(ch.codePointBefore(3));
		
		System.out.println(ch.codePointCount(0,4));
		
	}
}