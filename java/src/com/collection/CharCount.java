package com.collection;

import java.util.Arrays;

//
//1.Write a Java program using HashMap to count and display the frequency of each character in the string "geeksforgeeks".
//input : geeksforgeeks
//output : g = 2, e = 4, k = 2, s = 2, f = 1, o = 1, r = 1
public class CharCount {

	public static void main(String[] args) {
		String word = "geeksforgeeks";
		char[] charact = word.toCharArray();
		System.out.println(Arrays.toString(charact));
	}
}