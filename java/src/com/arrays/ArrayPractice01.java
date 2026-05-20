package com.arrays;

public class ArrayPractice01 {

	public static void main(String[] args) {

		int[] ages = new int[50];
		String even = "";
		String odd = "";
		int len = ages.length;
		
		for(int i = 0;i<50;i++) {
			if(ages[i] % 2 == 0) {
				even = " " + ages[i];
			}else {
				odd = " "+ ages[i];
			}
		}
		System.out.println(even);
		System.out.println(odd);
		
		
	}

}
