package com.strings;

public class DuplicateElements {
	public static void main(String[] args) {
		String str = "programming";
		
		String duplicates = "";
		
		for(int i = 0;i<str.length();i++) {
			char c = str.charAt(i);
			if(str.indexOf(c) != str.lastIndexOf(c)  && duplicates.indexOf(c) == -1) {
				duplicates = duplicates + c;
			}
		}
		System.out.println(duplicates);
	}

}
