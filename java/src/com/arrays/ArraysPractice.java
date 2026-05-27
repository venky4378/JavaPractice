
package com.arrays;

public class ArraysPractice {

	public static void main(String[] args) {

		int playercount = 0;
		String[][] names = { { "Venky", "swamy", "dube" }, { "gaikwad", "krunal", "mayanl", "patidhar" },
				{ "king", "mayank", "moon", "monlye" } };

		for (int i = 0; i < names.length; i++) {
			if (i <= 1) {
				for (int j = 0; j < names[i].length; j++) {
					System.out.print(names[i][j] + " ");
				}

			}
			System.out.println();

//				System.out.println(playercount);
//				System.out.println(names.length);

		}

	}

}
