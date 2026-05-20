package com.conditions.loops.whil;

//Spy Number : 1124     (1+1+2+4 = 8) = (1*1*2*4)
//and range of numbers

import java.util.Scanner;

public class SpyNumber {

	static boolean isSpy(int n) {
		boolean status = false;

		int r = 0;
		int sum = 0;
		int prod = 1;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			prod = r * prod;
			sum = sum + r;
		}
		if (prod == sum) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = isSpy(n);
		for(int i = 1;i<=n;i++)
		if(isSpy(i)) {
			System.out.println(i);
		}
	}

}
