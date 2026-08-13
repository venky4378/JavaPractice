package com.collection;

import java.util.Arrays;
import java.util.LinkedList;

//1.Write a Java program to store integers in a LinkedList and check whether the LinkedList is a palindrome.
//Input: 1 2 3 2 1
//Output : Palindrome

public class TestDemoLinkedList01 {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(2);
		li.add(1);
		System.out.println(li);
		
		
		int start = 0;
		int end = li.size()-1;
		boolean palindrome = true;
		while(start<end) {
			if(!li.get(start).equals(li.get(end))) {
				palindrome =  false;
				break;
			}
			
			start++;
			end--;
			
		}
		
		if(palindrome) {
			System.out.println("Palindrome "+ li);
		}else {
			System.out.println("Not a palindrome "+ li);
		}
		
		
		
		
		
	}

}
