package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTestDemo {
	
	public static void main(String[] Venky) {
		
		//LinkedHashList is working based on the hashset means unique values only in the insertion order.
		Set<Integer> si = new LinkedHashSet<>();
		si.add(20);
		si.add(23);
		si.add(33);
		si.add(45);
		si.add(78);
		si.add(88);
		si.add(20);
		si.add(33);
		
		
		System.out.println(si);
		
		
		
	}

}
