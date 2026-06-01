package com.conditions.loops;

//Using string doing reverse

import java.util.Scanner;

public class ReverseString {

	static void reverseString(String n) {
		String rev = "";

		for (int i = n.length() - 1; i >= 0; i--) {

			rev = rev + n.charAt(i);
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {

		String n = "Venky";

		reverseString(n);

	}

}
