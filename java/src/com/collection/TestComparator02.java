package com.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//1.Write a Java program to implement sorting of Employee objects using the Comparable interface.
//Create an Employee class with id, name, and salary fields.
//Sort employees based on salary in ascending order using compareTo().
//Print employee details before and after sorting.

public class TestComparator02 {

	public static void main(String[] args) {

		EmployeeModel e1 = new EmployeeModel(1, "Vikas", 5000.00);
		EmployeeModel e2 = new EmployeeModel(2, "Hindu", 9000.00);
		EmployeeModel e3 = new EmployeeModel(3, "Suresh", 8000.00);

		List<EmployeeModel> li = new ArrayList<>();

		li.add(e1);
		li.add(e2);
		li.add(e3);

		Collections.sort(li);

		System.out.println(li);
		
		System.out.println("***************************");
		Random ran = new Random();
		
		int dice = ran.nextInt(6) + 1;
		
		System.out.println(dice);

	}

}
