package com.conditions.loops;

public class PrimeorOddNumbers {

	public static void main(String[] args) {
		int even=0;
		int odd =0;
		
		for(int i = 0;i<=50;i++) {
			if(i % 2 ==0) {
				even=i;
				System.out.print("Even numbers are : " +i+" ");
			}
			else {
				odd = i;
				System.out.println("Odd numbers are : " + i);
			}
		}

	}

}
