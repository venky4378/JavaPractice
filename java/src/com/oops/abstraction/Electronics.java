package com.oops.abstraction;

import java.util.Scanner;

//
public class Electronics implements Product{
	
	Scanner sc = new Scanner(System.in);
	int quantity = sc.nextInt();
	double price = sc.nextDouble();
	
	public void buy(int quantity) {
		price = quantity * price ;
		System.out.println(price);
	}
	
	
	
}
