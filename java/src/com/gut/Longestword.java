package com.gut;

import java.util.Arrays;
import java.util.Scanner;

//1. Given a sentence, find the longest word.

//Input:  str = "In Vcube, Java is simple"
//Output:  simple
//Constraint: Ignore punctuation & Symbols

public class Longestword {

	public static void main(String[] args) {
		
		String sent = "In Java, Java !is simple By   Srikanth";
		
		String sent1 = sent.replaceAll("[^a-zA-Z0-9 ]", "");
		
		String[] words = sent1.trim().split("\\s+");
		
		System.out.println(Arrays.toString(words));
		
		String longest = words[0];
		
		for(String word : words) {
			if(word.length() > longest.length()) {
				longest = word;
			}
		}
		System.out.println(longest);
	

	}

}
