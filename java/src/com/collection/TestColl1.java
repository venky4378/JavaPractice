package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class TestColl1 {

	public static void main(String[] args) {

		
		List<Integer>	a = new ArrayList();	
		
		List<Integer> b = new ArrayList();
		
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		
//		a.addFirst(10);
		a.addAll(b);
		
		Iterator<Integer> e=a.iterator();
		
		while(e.hasNext()) {
			System.out.print(e.next() + " ");
			
		}
		
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(b.containsAll(a));
		System.out.println(a.contains(b));
		
	}

}
