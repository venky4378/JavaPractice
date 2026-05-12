package com.conditions.loops;

import java.util.Scanner;

public class CountEvenOrOdd {
	int evenCount = 0;
	int oddCount = 0;

	void countPrimerodd(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				evenCount += 1;
			} else {
				oddCount += 1;
			}
		}
		System.out.println("Even count : " + evenCount + "Odd Count : " + oddCount);
//		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of numbers : ");
		int n = sc.nextInt();
		CountEvenOrOdd o = new CountEvenOrOdd();		
		o.countPrimerodd(n);

	}

}
