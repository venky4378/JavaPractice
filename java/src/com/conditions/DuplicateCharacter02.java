package com.conditions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter02 {
	
	public static void main(String[] args) {
		String str = "programming";
		
		Map<Character,Integer> m = new HashMap<>();
		char[] ch = str.toCharArray();
		for(Character e : ch) {
			if(m.containsKey(e)) {
				m.put(e, m.get(e) +1);
			}else {
				m.put(e, 1);
			}	
		}
		for(char ch1 :str.toCharArray()) {
			if(m.get(ch1) > 1) {
				System.out.println(ch1);
				m.put(ch1,0);	
			}
		}
	}

}
