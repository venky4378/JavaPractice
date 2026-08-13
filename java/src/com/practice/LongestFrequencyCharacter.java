package com.practice;

import java.util.HashMap;

public class LongestFrequencyCharacter {
	void main() {
		
		String str = "pwwkew";
		
		
		char[] ch = str.toCharArray();
		
		char longest = ch[0];
		System.out.println(longest);
		HashMap<Character,Integer> map = new HashMap<>();
		
		
		
		for(char c:ch) {
			int count = 1;
			if(!map.containsKey(c)) {
				map.put(c,1);
				count++;
			}else {
				
				
				
			}
			
			System.out.println(map.get(c)+ " "+ count);
		}
		
		}
		
	}


