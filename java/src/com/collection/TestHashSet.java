package com.collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {

		
		Set<Integer> li = new HashSet<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(22);
		li.add(55);
		li.add(34);
		li.add(54);
		li.add(54);
		li.add(10);
		li.add(20);
		li.add(null);
		li.add(null);
		
		
		
		System.out.println(li);
	}

}
