package com.conditions.loops;

import java.util.Scanner;

public class FabonocciNthElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number");
		int n = sc.nextInt();
		System.out.println("number");

//		int n4= sc.nextInt();
		int n1 = 0;
		int n2  = 1;
		
		for(int i = 3;i<=n;i++) {
			int n3 = n1 + n2;
			if(i == n) {
				System.out.println("Position at that point : " + n3);
			}   
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;	
		}
		
		sc.close();
	}

}
