package com.collection;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

///Using Comparable we can sort only one attribute only with the given object.

public class TestCompara {

	public static void main(String[] args) {
		
		StudentCompare1 s1 = new StudentCompare1("Mahesh",23,60000);
		StudentCompare1 s2 = new StudentCompare1("Ramesh",45,70000);
		StudentCompare1 s3 = new StudentCompare1("Kamesh",56,90000);
		StudentCompare1 s4 = new StudentCompare1("Uma",56,87000);
		StudentCompare1 s5 = new StudentCompare1("Navya",98,90000);
		
		List<StudentCompare1> li = new ArrayList<>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		
		Collections.sort(li);
		
		
//		System.out.println(li);
		
		for(StudentCompare1 s:li) {
			System.out.println(s);
		}
		
		
		
		
		

	}

}
