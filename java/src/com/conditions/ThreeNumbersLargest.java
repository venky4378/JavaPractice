package com.conditions;

import java.util.Scanner;

public class ThreeNumbersLargest {

	
	public static void main(String[] args) {
		
		int a ;
		int b ;
		int c ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Value : ");
		a = sc.nextInt();
		System.out.println("Enter B Value : ");
		b = sc.nextInt();
		System.out.println("Enter C Value : ");
		c = sc.nextInt();
		
		
		if((a>b) && (a>c)) {
			System.out.println("A is greatest");
			
		}else if(b>c) {
			System.out.println("B is Greatest");
		}else{
			System.out.println("C is greatest");
			
		}
			
		

		
	}

}
