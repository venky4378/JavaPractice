package com.practice;

public class ObjectArray {

	public static int findSum(Object[] arr) {
		int sum = 0;

		for (Object obj : arr) {

			if (obj instanceof Integer) {
				sum += (Integer) obj;
			} else if (obj instanceof Object) {
				sum += findSum((Object[]) obj);
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		Object[] arr = { 10, new Object[] { 20, 30, new Object[] { 40, 50 } } };
		System.out.println(findSum(arr));
	}

}
