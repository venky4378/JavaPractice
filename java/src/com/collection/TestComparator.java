package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		MobileCompare m1 = new MobileCompare("T1", "Vivo", 90000);
		MobileCompare m2 = new MobileCompare("( pro +", "Realme", 70000);
		MobileCompare m3 = new MobileCompare("reno 4", "Oppo", 30000);
		MobileCompare m4 = new MobileCompare("9", "APple", 80000);
		MobileCompare m5 = new MobileCompare("t2x", "Vivo", 33000);

		List<MobileCompare> li = new ArrayList<>();
		li.add(m1);
		li.add(m2);
		li.add(m3);
		li.add(m4);
		li.add(m5);

		Comparator<MobileCompare> s = new Comparator<MobileCompare>() {

			@Override
			public int compare(MobileCompare o1, MobileCompare o2) {
				if (o1.price < o2.price) {
					return -1;
				} else if (o1.price > o2.price) {
					return 1;
				} else {
					return 0;
				}
			}
		};

		Collections.sort(li, s);

		for (MobileCompare m : li) {
			System.out.println(m);
		}
	}

}
