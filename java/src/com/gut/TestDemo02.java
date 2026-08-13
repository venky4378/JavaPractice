package com.gut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TestDemo02 {
	void main() {
		
		String input = "eat nat tea bat rat ate tan";
		
		String[] words = input.split(" ");
		
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		
		for(String word: words) {
			
			char[] ch = word.toCharArray();
			
			Arrays.sort(ch);
			
			String key = new String(ch);
			
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
				
			}
			map.get(key).add(word);
		}
		
		int group = 1;
		
		for(ArrayList<String> list : map.values()) {
			System.out.println("Group " + group + " : "+ list);
			group++;
			
		}
		
	}

}
