package com.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSameEleHashset {
	
	public static void main(String[] args) {
		
		Set<Integer> si = new HashSet<>();
		si.add(10);
		si.add(20);
		si.add(30);
		si.add(40);
		si.add(50);

		Set<Integer> si2 = new HashSet<>();
		si2.add(30);
		si2.add(40);
		si2.add(50);
		si2.add(60);
		si2.add(70);

		
		for(int num:si2) {
			if(si.contains(num)) {
				System.out.print(num + " ");
			}
		}
		
	}
 
}
