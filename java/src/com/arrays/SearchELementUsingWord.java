package com.arrays;

/// Search Element by using letter and containing words

public class SearchELementUsingWord {

	public static void main(String[] args) {

		String[] name = new String[4];

		name[0] = "Mahesh";
		name[1] = "Laila";
		name[2] = "mukund";
		name[3] = "Tom";

		for (int i = 0; i < name.length; i++) {
			if (name[i].contains("u")) {
				System.out.print(name[i]);
			}
		}
	}

}
