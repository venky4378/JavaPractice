package com.gut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupingAnagrams {

	public static void main(String[] args) {
		
		
		
		 String input = "tea ate eat tan nat mat";

	        String[] words = input.split(" ");
	        HashMap<String,ArrayList<String>> map = new HashMap<>();


	        for(String word: words){
	            
	            char[] c = word.toCharArray();

	            Arrays.sort(c);

	            String key = new String(c);

	            if(!map.containsKey(key)){
	                map.put(key,new ArrayList<>());
	            }
	            map.get(key).add(word);
	        }

	        int group = 1;
	        

	        for(ArrayList<String> list:map.values()){
	            System.out.println("Group" + group + " : "+list);
	            group++;
	        }


//		String a = "eat tea tan ate nat bat";
//
//		String[] a1 = a.trim().split(" ");
//		System.out.println(Arrays.toString(a1));
//
//		Map<String, ArrayList<String>> map = new HashMap<>();
//
//		for (String word : a1) {
//
//			char[] chars = word.toCharArray();
//
//			Arrays.sort(chars);
//
//			String key = new String(chars);
//
//			if (!map.containsKey(key)) {
//				map.put(key, new ArrayList<>());
//
//			}
//			map.get(key).add(word);
//		}
//		int group = 1;
//
//		for (ArrayList<String> list : map.values()) {
//			System.out.println("Group " + group + " : " + list);
//			group++;
//		}
	}

}
