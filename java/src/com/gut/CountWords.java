package com.gut;

import java.util.Arrays;

public class CountWords {
	
	public static void main(String[] args) {	
		String str = "   Java Full    Stack  Developer";
		int wordCount = 0;		
		for(int i = 0;i<str.length();i++) {
			if((str.charAt(i) != ' ') && (i == 0 || str.charAt(i-1) == ' ')) {
				wordCount++;	
			}
		}
		System.out.println(wordCount);	
	}
}
