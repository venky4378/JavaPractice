package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestEven {
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>(Arrays.asList(12,43,54,3,5,7,6667,87,78,88,43,22));
		
		Stream<Integer> s = li.stream();
		Stream<Integer> s1 = s.filter(n -> n % 2 == 0);
		List<Integer> s3 = s1.collect(Collectors.toList());
		
		System.out.println(s3);
		
		List<Integer> str = li.stream().filter(m->{
			for(int i = 2;i<m;i++) {
				if(m%i == 0) {
					return false;
				}
				
			}
			return true;
		}).collect(Collectors.toList());
		
		System.out.println(str);
		
	}

}
