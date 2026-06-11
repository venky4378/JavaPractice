package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class TestEvenOddIndex {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();

		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		int i = 0;
		Iterator<Integer> itr = arr.iterator();

		while (itr.hasNext()) {
			itr.next();
			if (i % 2 == 0) {
				arr.set(i, 0);
			}
			i++;

		}
		System.out.println(arr);

	}
}
