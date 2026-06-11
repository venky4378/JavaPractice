package com.arrays;

import java.util.Arrays;

//int[] salaries = {25000, 45000, 30000, 55000, 45000, 60000, 25000, 70000};
//
//Perform the following operations:
//
//Find the highest salary.
//Find the lowest salary.
//Calculate the average salary.
//Count how many employees earn more than the average salary.
//Count how many employees earn exactly ₹45,000.
//Display all salaries in reverse order.
//Find the second highest salary.

public class TestDemo08 {

	public static void main(String[] args) {
		
		String s1 = "Surya";
		String s2 = "Surya";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		int[] sal = {25000,45000,3000,55000,45000,60000,25000,70000};
		int max = sal[0];
		int min = sal[0];
		int second = sal[0];
		int sum = 0;
		int count = 0;
		for(int i = 0;i<sal.length;i++) {
			if(sal[i] > max) {
				second = max;
				max = sal[i];
				
			}else if(second > sal[i] && second != max) {
				second = sal[i];
			}
			else if(sal[i]<min) {
				min = sal[i];
			}
			sum += sal[i];
			if(sal[i] == 45000) {
				count++;	
		}
			
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println("Second Max: "+second);
		
		System.out.println("Average : "+ (sum/sal.length));
		System.out.println("Persons Earning 45000 : "+ count);
		reverse(sal);
	
		
		
	}

	public static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		int temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}

		System.out.println(Arrays.toString(arr));

	}
}
