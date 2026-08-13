package com.gut;

public class TestDemoCheck {
	public static void main(String[] args) {
		
		String str = "programming";
		
		char[] ch = str.toCharArray();
		int vowel =0 ;
		int consonants = 0;
		
		for(char c : ch) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowel++;
			}else {
				consonants++;
			}
		}
		System.out.println(vowel);
		System.out.println(consonants);
	}

}
