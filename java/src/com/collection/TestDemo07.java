package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestDemo07 {


	public static void main(String[] args) {

//		12321
		
		
		List<Integer> li = new ArrayList<>();
		
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(5);
		li.add(10);
		
		
		int n = 5;
		int max = Collections.max(li);
		int actualNum = 0;
		int exactValue = (n*(n+1))/2;
		
		for(int i = 1;i<=max;i++) {
			if(!li.contains(i)) {
				System.out.println(i);
			}
		}
		
			
		
		
	}

}
