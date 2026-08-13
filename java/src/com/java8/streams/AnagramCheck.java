package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnagramCheck {
	
	public static void main(String[] args) {
		
		List<String> li = Arrays.asList("listen","silent");
		
		li = li.stream().sorted().collect(Collectors.toList());
		
		System.out.println(li);
		
		
	}
	
	

}
