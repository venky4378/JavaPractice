package com.conditions.loops.whil;

import java.util.Scanner;

public class IsArmstrong {
	static boolean isArmstr(int n) {
		boolean status = false;
		int r = 0;
		int temp = n;
		int sum = 0;
		int n1 = n;
		int r1 = 0;
		int count = 0;
		int co = 0;
//
		
		
//		String m1 = Integer.toString(n);
//		int n1 = m1.length();
//		
		while (n1 > 0) {
			r1 = r1 % 10;
			n1 = n1 / 10;
			co= count+1;
		}
		count = co;
		
		

		while (n > 0) {
			//System.out.println(n);
			r = n % 10;
			n = n / 10;
			int a = r;
			System.out.println(r);
//			sum = (int) (sum + Math.pow(r, n1));
			for(int i = 1;i<=count-1;count--) {
				System.out.println(r);
				a=r*a;
			}
			sum+=a;
			System.out.println(a);
		}
		
		
		if (sum == temp) {
			status = true;
		} else {
			status = false;
		}

		return status;

	}

	public static void main(String[] args) {

		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = isArmstr(n);

		if (flag) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not an Armstrong");
		}

	}

}
