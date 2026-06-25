package com.arrays;

import java.util.Arrays;

//Batch70
//Java - 
//1.Check Whether Two Strings Are Anagrams
//Anagram - Two strings are anagrams if they contain the same characters with the same frequency, regardless of their order.
//input:  listen , silent
//Output:  Anagram

public class AnagramCheck {

	public static void main(String[] args) {

		String s1 = "listen";
		String s2 = "silent";
		int len1 = s1.length();
		int len2 = s2.length();
		
		char[] ch = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch2);
		String ch3 = new String(ch);
		String ch4 = new String(ch2);
//		System.out.println(ch3);
//		System.out.println(ch4);
		

		if(ch.equals(ch2) && (ch.length == ch2.length)){
			System.out.println("Anagram");
		}else {
			System.out.println("Not an Anagram");
		}
		
		System.out.println(ch);
		System.out.println(ch2);
	}

}
