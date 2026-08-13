package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestDemoDuplicate01 {
	
	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(1,2,3,4,3,2,1,4,5,6);
		
		List<Integer> li2 = li.stream().distinct().collect(Collectors.toList());
		Integer i = li.stream().distinct().findFirst().orElseThrow();
		
		System.out.println(li2);
		System.out.println(i);
		
		
		
	}

}
