package com.collection;

import java.util.ArrayList;
import java.util.List;
public class TestStudent {
	
	

	public static void main(String[] args) {
		
		TestStudentModel t1 = new TestStudentModel(2,"Ramesh",25,"Python");
		TestStudentModel t3 = new TestStudentModel(3,"Venky",67,"Devops");
		TestStudentModel t2 = new TestStudentModel(1,"Suresh",78,"MachineLearning");
		
		List<TestStudentModel> li = new ArrayList<>();
		
		li.add(t1);
		li.add(t2);
		li.add(t3);
		
//		System.out.println(li);
		
		for(TestStudentModel s : li) {
			System.out.println(s);
		}
		
		
		
		
	}
}
