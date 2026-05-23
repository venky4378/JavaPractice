package com.arrays;

public class ReverseOnlyEven {

	public static void main(String[] args) {

		int[] srr = {5, 8, 11, 15, 17, 20, 3, 6, 9, 13, 19, 21, 25, 29};
		String even = " ";
		
		for(int i:srr) {
			if(i % 2 == 0) {
				even = i + " ";
			}
		}System.out.print(even);
	}

}
