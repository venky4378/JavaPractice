package com.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator01 {

	public static void main(String[] args) {

		StudentCompare1 s1 = new StudentCompare1("Mahesh", 23, 60000);
		StudentCompare1 s2 = new StudentCompare1("Ramesh", 45, 70000);
		StudentCompare1 s3 = new StudentCompare1("Kamesh", 56, 90000);
		StudentCompare1 s4 = new StudentCompare1("Uma", 56, 87000);
		StudentCompare1 s5 = new StudentCompare1("Navya", 98, 90000);

		List<StudentCompare1> li = new ArrayList<>();

		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);

		li.add(s5);

		Comparator<StudentCompare1> c = new Comparator<StudentCompare1>() {

			@Override
			public int compare(StudentCompare1 o1, StudentCompare1 o2) {
				if (o1.age < o2.age) {
					return +1;
				}else if(o1.age >  o1.age) {
					return -1;
				}else {
					return 0 ;
				}
//				return o1.name.compareTo(o2.name);
			}

		};

		Collections.sort(li, c);

		for (StudentCompare1 s : li) {
			System.out.println(s);
		}

	}

}
