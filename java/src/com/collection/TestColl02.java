package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


//add(),addAll(),remove() ,removeIf(),contains(),clear(),equals(),iterator(),it.hasNext(),itr.next();
 
//removeAll() vs clear() -->removeAll -  if we want to remove particular collection like subcollection if we before add 
//so that collection entire collection is removed from the given collection like 
//we have  batter & bowlers -[Dhoni,vaibhav,raina]  [rabada,archer,buvi] team = [Dhoni,vaibhav,raina,rabada,archer,bhuiv]
//		the bowlers  will be remove when we call team.removeAll(bowlers)
// when we say clear like team.clear() the entire players will be removed from the team and then empty array[].
  


public class TestColl02 {

	public static void main(String[] args) {

		Collection<String> csk = new ArrayList<>();
		Collection<String> mi = new ArrayList<>();

		csk.add("Jadeja");
		csk.add("Dhoni");
		csk.add("Raina");
		csk.add("Aswin");
		csk.add("Mohit sharma");

		mi.add("Rohit");
		mi.add("Hardik");
		mi.add("Malinga");
		mi.add("Sachin");

//		Iterator<String> itr = csk.iterator();
//
//		while (itr.hasNext()) {
//			String t = itr.next();
//
//			if (t == "Raina") {
//				itr.remove();
//
//			}
//		}
		
//		i->i.equals("Hardik")  --->predicate lamba Expresion
		mi.removeIf(i->i.equals("Hardik"));
		
		System.out.println(mi);
		
		System.out.println("-------------------------");
		
		

//		for (String i : csk) {
//
//			if (i.equals("Raina")) {
//				csk.remove(i);
//			}
//
//		}
//		Exception in thread "main" java.util.ConcurrentModificationException
//		at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
//		at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
//		at com.collection.TestColl02.main(TestColl02.java:35)

		System.out.println(csk);
		csk.addAll(mi);
		System.out.println(csk);
		System.out.println(csk.contains("Dhoni"));
		System.out.println(csk.containsAll(mi));
		System.out.println(csk.hashCode());
		System.out.println(mi.hashCode());
//		
//		System.out.println(csk.isEmpty());

//		csk.removeAll(csk);
//		System.out.println(csk);

	}

}
