package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Test09 {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();
		
		li.add(12);
		li.add(12);
		
		for(int i = 0;i<li.size();i++) {
			boolean palindrome = false;
			
				if(li.get(i) == (li.get(i+1))) {
					
					palindrome = true;
					i++;
					
				}
			
			System.out.println(palindrome);
			if(palindrome) {
				System.out.println("The given number is palindrome");
			}else {
				System.out.println("Not a palindrome");
			}
		}
		
		
	}

}
