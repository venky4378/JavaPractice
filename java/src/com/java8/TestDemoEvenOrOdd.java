package com.java8;

interface In3 {
	public String check(int a);
}

public class TestDemoEvenOrOdd {
	public static void main(String[] args) {

		In3 i1 = (a) -> {
			if (a % 2 == 0) {
				return "even";
			} else {
				return "odd";
			}
		};

		System.out.println(i1.check(5));
	}

}
