package com.practice;

import java.util.Arrays;

public class TestPracticeObjectArray {

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

		Object[] obj = { 10, new Object[] { 20, 30, new Object[] { 50, 60 } } };

		System.out.println(findSum(obj));
	}

}
