package com.practice;

import java.util.HashMap;
import java.util.Map;

public class CountOccurances {

	public static void main(String[] args) {

		String str = "programmming";

		Map<Character, Integer> map = new HashMap<>();

		char[] ch = str.toCharArray();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);

		char maxChar = ' ';
		int maxCount = 0;

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxChar = entry.getKey();
			}
		}

		System.out.println("max Occurances : " + maxChar);
		System.out.println("Count " + maxCount);
	}

}
