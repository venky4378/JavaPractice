package com.strings;

import java.util.Arrays;

public class LongestString {
	
	public static void main(String[] args) {
		
		String str = new String("Java programming language  is a powerful ");
		
		String[] str2 = str.split(" ");
		
		System.out.println(Arrays.toString(str2));
		String longest = str2[0];
		
		for(String word : str2) {
			if((word.length()) > word.length()) {
				longest = word;
			}
			System.out.println(longest);
		}	
	}

}
