package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MUltiplicationTable {

	public static void main(String[] args) {

		List<Integer> lis = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number the table you want: ");
		int n = sc.nextInt();

		for (int i = 0; i <= 10; i++) {
			lis.add(n * i);
		}
		int i = 1;
		for(int value:lis) {
			System.out.println(n +" * " + i + " = " + value);
			i++;
		}
		
	
	}

	}

