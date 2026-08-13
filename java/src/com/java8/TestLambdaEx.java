package com.java8;

import java.util.Scanner;

interface LambdaEx01{
	int  add(int a,int b);
	
}


public class TestLambdaEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LambdaEx01 t = (a,b) ->a + b;
		System.out.println(t.add(5, 7));

		
	}

}
