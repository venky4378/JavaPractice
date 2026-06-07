package com.arrays;

public class TestDemo05 {

	public static void main(String[] args) {

		String arr = "Venky I Love You";
		String temp = "";
		for(int i = arr.length()-1;i>=0;i--) {
			temp = temp + arr.charAt(i);
		}
		
		System.out.println(temp);
	}

}
