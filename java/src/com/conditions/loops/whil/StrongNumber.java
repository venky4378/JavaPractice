package com.conditions.loops.whil;

import java.util.Scanner;

//Strong Numbers
//A number is strong if the sum of factorials of its digits equals the number.
//Example: 145 → 1! + 4! + 5! = 145 → Strong.

public class StrongNumber {
	
	static boolean isStrongNum(int n){ // 153
		boolean status = false;
		int r = 0;
		int temp = n;
		int sum = 1;
		int fact = 1;
		while(n<0) {
			r = n % 10;			//3
			n = n/10;	
			for(int i = 1;i<n;i++) {
				fact *= i;
			}
			System.out.println(fact);
			sum += fact;		//3
		}
		System.out.println(sum);
		
		
		return false;
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		boolean flag = isStrongNum(n);
	}

}
