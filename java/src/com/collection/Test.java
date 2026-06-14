package com.collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class Test {

	public static void main(String[] args) {

		
		
//		Set<Integer> li = new Set<>();
		List<Object> li = new ArrayList<>();
		li.add(23);
		li.add(44);
		li.add(55);
		li.add(76);

		li.add(89);
		li.add("String");
		li.add('c');
		
		System.out.println(li);
		System.out.println(li.hashCode());

	}

}
