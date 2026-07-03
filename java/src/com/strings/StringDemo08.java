package com.strings;

public class StringDemo08 {

	public static void main(String[] args) {
		String s1 = "Java I Love Vcube";
		s1 = s1.substring(0,4);
		System.out.println(s1);
		
		String s2 = "I Love Java";
		s2 = s2.substring(3,7);
		System.out.println(s2);
		
		String ph = "998877556";
		long ph1 = Long.parseLong(ph);
		System.out.println(ph1);
		
		String sal = "10000";
		sal = String.valueOf(sal);
		System.out.println(sal);
	}
}
