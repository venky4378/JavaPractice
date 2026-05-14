package com.conditions.loops;

import java.util.Scanner;

public class EvenOrOddRecursion {
	
	
	static boolean isEvenOdd(int n) {
		if(n == 0) {
			return true;
		}else if (n == 1){
			return false;
		}
		return isEvenOdd(n-2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = sc.nextInt();
		
		boolean result = isEvenOdd(n);
		System.out.println(result);
	}

}
