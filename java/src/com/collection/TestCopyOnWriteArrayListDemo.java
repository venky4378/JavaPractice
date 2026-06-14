package com.collection;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCopyOnWriteArrayListDemo {

	public static void main(String[] args) {

		List<Integer> li = new CopyOnWriteArrayList<>();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);

		Iterator<Integer> itr = li.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			li.add(60);
		}

		System.out.println(li);
	}

//		for(int i = 0;i<li.size();i++) {
//			System.out.println(li.get(i));
//			li.add(90);
//		}                    for this the loop will be infinite loop when we use for loop 
}
