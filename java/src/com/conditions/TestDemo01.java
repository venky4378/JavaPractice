package com.conditions;

public class TestDemo01 {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		int[] b = a;
		b[2] = 99;
		int i = 9;
		System.out.println(a[2]);
		System.out.println(i++);
		System.out.println(i++);
	}
}
