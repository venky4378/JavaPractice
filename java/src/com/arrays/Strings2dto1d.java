package com.arrays;

import java.util.Scanner;

public class Strings2dto1d {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] teams = { "CSK", "MI", "RCB" };
		String[][] names = new String[3][3];

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter players of team: " + teams[i] + ":");
			for (int j = 0; j < names[i].length; j++) {
				System.out.println("Enter the value at " + i + " " + j);
				names[i][j] = sc.next();
			}
		}

		for (int i = 0; i < names.length; i++) {
			System.out.print("Enter players of team: " + teams[i] + "	:");
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j] + " ");
			}

			System.out.println();
		}
	}

}
