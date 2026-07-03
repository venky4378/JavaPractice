package com.strings;

public class CountVowelsConsonants {
	public static void main(String[] args) {
		String s = "Rainbow is very nice and seven coloured ribbon";
		
		char[] ch = s.toCharArray();
		int vowelsCount = 0;
		int consonantsCount = 0;
		
		for(char c:ch) {
			if(c == 'a' || c == 'e'|| c == 'i'||c == 'o' || c == 'u') {
				vowelsCount++;
			}else {
				consonantsCount++;
			}
		}
		System.out.println("Vowels Count : "+vowelsCount);
		System.out.println("consonants Count : "+consonantsCount);
	}

}
