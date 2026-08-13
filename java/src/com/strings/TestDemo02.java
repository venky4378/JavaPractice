package com.strings;

public class TestDemo02 {

	public static void main(String[] args) {

		String str = "abcd2502ef27";

		String word = "";

		char[] ch = str.toCharArray();
		int digit = 0;

		for (char s : ch) {
			if (Character.isAlphabetic(s)) {
				word = word + s;
			} else if (Character.isDigit(s)) {
				digit = Character.getNumericValue(s) + digit;
			}
		}
		System.out.println(word);
		System.out.println(digit);

		System.out.println(word + digit);
	}

}
