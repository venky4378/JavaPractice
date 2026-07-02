package com.strings;

public class ReverseWithoutDuplicates {
	
	public static void main(String[] args) {
//		String ch = "programming";
		String rev = "";
		
//		for(int i = 0;i<ch.length();i++) {
//			int j = 0;
//			if(ch.charAt(i) != ch.charAt(j)) {
//			rev = ch.charAt(i) + rev;
//			j++;
//		}
//	}
		System.out.println(rev);
		String ch = "Swamy";
		String ch2 = "Swayy";
		
		
//		
//		char[] letter = {'J','a','v','a'};
//		String word = String.copyValueOf(letter);  ///coverting the array of chars into String by using copyOf() method
//		System.out.println(word);
		
//		String word1 = "Spring".toLowerCase();
//		String word2 = "Swagger";	
//		System.out.println(word1.contains("spring"));//true   //compares char sequence of the given string value and gives boolean values
		
//		System.out.println(word1);
//		System.out.println(ch.compareTo(ch2));//-12  it compares the asci values lexicographically
		
//		char[] c = { 'j', 'a', 'v', 'a', 'i', 's', 's', 'i', 'm', 'p', 'l', 'e' };
//
//		String c1 = String.copyValueOf(c, 5, 6);
//		String c2 = String.copyValueOf(c, 1, 6);// from c->object ,1->offset , 6->from 1 to 6 characters
//
//		System.out.println(c1);
//		System.out.println(c2);
		
		
		String[] str = {"J2SE","J2EE","Spring Boot","Micro Service","JDBC"};
		
		for(String str2:str) {
			if((str2.toLowerCase().startsWith("j")) && (str2.toLowerCase().endsWith("e"))) {
				System.out.println(str2);
			}
		}


}

	}
