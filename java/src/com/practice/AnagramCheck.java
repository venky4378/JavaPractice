package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void isAnagram(String str, String str2) {
		boolean flag = false;
		String temp1 = str;
		String temp2 = str2;

		char[] sort1 = str.toCharArray();
		char[] sort2 = str2.toCharArray();

		Arrays.sort(sort1);
		Arrays.sort(sort2);

		if (Arrays.equals(sort1, sort2))
			System.out.println("The given strings are anagrams");
		else
			System.out.println("the given are not anagrams");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();

		isAnagram(str, str2);

	}

}
