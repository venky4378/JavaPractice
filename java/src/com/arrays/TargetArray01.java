package com.arrays;
//1.Write a Java program to find two numbers in a sorted array whose sum is equal to a given target value using the Two Pointer Technique.

//Case 1:
//Input:Array = {1, 2, 4, 7, 11, 15}
//Target = 15
//Output:
//Pair Found: 4 and 11
//Case 2:
//Input:Array = {1, 2, 3, 4, 5}
//Target = 20
//Output:No Pair Found

public class TargetArray01 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 7, 11, 15 };
		int target = 11;
		String pairs = "";
 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(arr[i] + " " + arr[j]);
					break;
				} else {
					pairs = "No pair found";
				}
			}
		}
		System.out.println(pairs);
	
	}

}
