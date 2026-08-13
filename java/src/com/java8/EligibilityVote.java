package com.java8;

import java.util.function.Predicate;

public class EligibilityVote {
	
	public static void main(String[] args) {
		int[] arr = {22,23,54,12,45};
		
		Predicate<Integer> p1  = (s) ->{
			boolean status = false;
			if(s > 18) {
				status = true;
				System.out.println("Eligible for Voting");
			}else {
				status = false;
				System.out.println("Not Eligible for Voting");
			}
			return status;
		};
		
		for(int i : arr) {
			System.out.print(i + " ");
			p1.test(i);
			
		}
	
	}

}
