package com.strings;

public class TestStrings {
	public static void main(String[] args) {
		String s = "java";
		String s1 = "ja";
		String s2 = "va";
		s1 = s1 + s2;
		s2 = s1.concat(s2);
		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s==s1);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}
