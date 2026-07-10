package com.gut;

import java.util.Arrays;
//1. Given an array of integers, sort the array using Merge Sort.
//Input:
//arr = [38, 27, 43, 3, 9, 82, 10]
//[3, 9, 10, 27, 38, 43, 82]

public class MergeSortDemo01 {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 50, 32, 2, 1, 4, 56 };

		divide(arr);

		System.out.println(Arrays.toString(arr));

	}

	public static void divide(int[] arr) {

		if (arr.length <= 1) {
			return;
		}
		int left[] = new int[arr.length / 2];
		int right[] = new int[arr.length - left.length];

		int i = 0;
		for (i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = arr[i++];
		}
		divide(left);
		divide(right);
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));

		merge(arr, left, right);

	}

	public static void merge(int[] arr, int[] l, int[] r) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < l.length && j < r.length) {
			if (l[i] < r[j]) {
				arr[k++] = l[i++];
			} else {
				arr[k++] = r[j++];
			}
		}

		while (i < l.length) {
			arr[k++] = l[i++];
		}
		while (j < r.length) {
			arr[k++] = r[j++];
		}
	}

}
