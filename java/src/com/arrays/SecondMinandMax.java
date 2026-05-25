package com.arrays;

public class SecondMinandMax {

	public static void main(String[] args) {
		int[] arr = { 12, 1, 23, -3, 34, 45, 65 };
		int firstMax = arr[0];
		int secondMax = arr[1];

		int firstMin = arr[0];
		int secondMin = arr[1];
		//MAX
		for (int i : arr) {
			if (i > firstMax) {
				secondMax = firstMax;
				firstMax = i;
			} else if (i < firstMax && i > secondMax) {
				secondMax = i;
			}
			
			//MIN
			if (i < firstMin) {
				secondMin = firstMin;
				firstMin = i;
			} else if (i < firstMin && i > secondMin) {
				secondMin = i;
			}
		}
		System.out.println(firstMax);
		System.out.println(secondMax);
		System.out.println(firstMin);
		System.out.println(secondMin);
	}

}
