package com.java8;

//Convert a string to uppercase.

interface In4 {
	public String getUpper(String s);
}
public class TestDemoString01 {
	public static void main(String[] args) {
		
		In4 i1 = (s) -> {
			String s2 = s.toUpperCase();
			return s2;
		};

		System.out.println(i1.getUpper("VENKY"));

	}

}
