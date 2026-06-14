package com.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet {
	//Tree set allows only h

	public static void main(String[] args) {

		
		SortedSet<Integer> li = new TreeSet<>();
		
		li.add(12);
		li.add(23);
		li.add(45);
		li.add(56);
		li.add(78);
		li.add(67);
		li.add(88);
		
//		returns elements in a sorted order
		System.out.println("List : "+ li); //List : [12, 23, 45, 56, 67, 78, 88]

		//returns the first sorted element
		System.out.println(li.first());//12
		
		//returns the last element after sorted
		System.out.println(li.last());//88
		
		//returns the elements from before 56 values after sorting
		System.out.println(li.headSet(56));//[12, 23, 45]
		
		//return the elements from 56 to end after sorted
		System.out.println(li.tailSet(56));//[56, 67, 78, 88]
		
		//returns elements in between them like from 23 and until 67 here 23 is inclusive and 67 is exclusive.
		System.out.println(li.subSet(23, 67));  //o/p: [23, 45, 56]
		
		}

}
