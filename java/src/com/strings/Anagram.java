package com.strings;

import java.util.HashMap;
import java.util.Map;

//1.Write a Java program using HashMap to count and display the frequency of each character in the string "geeksforgeeks".
//input : geeksforgeeks
//output : g = 2, e = 4, k = 2, s = 2, f = 1, o = 1, r = 1

public class Anagram {

	public static void main(String[] args) {

		String str = "geeksforgeeks";

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : str.toCharArray()) {

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}
		System.out.println(map);

	}

}

//String word= "geeksforgeeks";
//Map<Character,Integer> map = new HashMap<>();
//
//
//for(char ch:word.toCharArray()) {
//	
//		if(map.containsKey(ch)) {
//			map.put(ch,map.get(ch)+1);
//		}
//		else {
//			map.put(ch, 1);
//		}
//}
//System.out.println(map);