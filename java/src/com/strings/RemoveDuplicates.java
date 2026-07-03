package com.strings;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		String str = sc.next();
		String A = "A";
		String B = "B";
		
		String result = "";
		
		for(int i = 0;i<str.length()-1;i++) {
			char c = str.charAt(i);
			if(result.indexOf(c) == -1) {
				result = result + c; 
			}
		}
		System.out.println(result);
		System.out.println(A.compareTo(B));
	}

}
