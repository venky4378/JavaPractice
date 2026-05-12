package com.conditions.loops;

public class FactorialNumber {
	static int fact = 1;
	int fact(int n) {
		for(int i = 1;i<=n;i++) {
			fact *= i;
		}return fact;
	}

	public static void main(String[] args) {
		
		FactorialNumber f1 = new FactorialNumber();
		System.out.println(f1.fact(4));

		
	}

}
