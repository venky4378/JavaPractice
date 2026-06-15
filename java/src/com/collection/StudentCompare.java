package com.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCompare {

	public static void main(String[] args) {

		StudentSort st1 = new StudentSort(1, "mahesh", 23, 5000.0);
		StudentSort st2 = new StudentSort(2, "Suresh", 23, 5000.0);
		StudentSort st3 = new StudentSort(5, "Amar", 23, 5000.0);
		StudentSort st4 = new StudentSort(9, "Joshna", 23, 5000.0);
		StudentSort st5 = new StudentSort(3, "Sowja", 23, 5000.0);

		List<StudentSort> li = new ArrayList<>();
		li.add(st1);
		li.add(st2);
		li.add(st3);
		li.add(st4);
		li.add(st5);

		Collections.sort(li);

		for (StudentSort s : li) {
			System.out.println(s);

		}

	}

}
