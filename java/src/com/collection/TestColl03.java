package com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestColl03 {

	public static void main(String[] args) {

		
		Collection<String> fruits = new ArrayList<>();
		Collection<String> veggies = new ArrayList<>();
		
		
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("PineApple");
		fruits.add("Potato");
		
		veggies.add("Cucumber");
		veggies.add("Tomamto");
		veggies.add("Brinjal");

//		fruits.retainAll(veggies);
//		System.out.println(fruits.retainAll(veggies));
		System.out.println(veggies.size());

		Object[] objs = veggies.toArray();		
		
		for(Object a : objs) {
			System.out.println(a);
		}
	}

}
