package com.collection;

import java.util.ArrayList;
import java.util.List;

//Input: 10 25 40 15 35 20

public class SecondLargestElement {

	public static void main(String[] args) {

		List<Integer> col = new ArrayList<>();

		col.add(10);
		col.add(25);
		col.add(40);
		col.add(15);
		col.add(35);
		col.add(20);

		int max = col.get(0);
		int second = col.get(0);
		
		for(int i : col) {
			if(i>max) {
				second = max;
				max = i;
			}else if(i>second && i!= max) {
				second = i;
			}
		}

		System.out.println(max);
		System.out.println(second);

	}

}
