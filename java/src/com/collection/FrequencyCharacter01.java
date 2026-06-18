package com.collection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FrequencyCharacter01 {

	public static void main(String[] args) {

//		System.out.println("ENter value: ");
//		Scanner sc = new Scanner(System.in);
//		String a = sc.next();
//		
//		char[] b1 = a.toCharArray();
		
//		Map<Entry<Character,Integer>> entry = 
		Map<Character,Integer> m = new HashMap<>();
		
//		for(char b: a.toCharArray()) {
//			if(m.containsKey(b)) {
//				m.put(b, m.get(b) +1 ); 
//			}else {
//				m.put(b, 1);
//			}
//		}
//		
		m.put('c',1);
		for(Map.Entry<Character,Integer> entry : m.entrySet()   ) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		
		
		
	}

}
