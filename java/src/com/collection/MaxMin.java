package com.collection;

import java.util.ArrayList;

public class MaxMin {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(30);
		arr.add(70);
		arr.add(40);
		arr.add(12);
		arr.add(65);
		arr.add(56);
		arr.add(77);

		int max = arr.get(0);
		int secMax = arr.get(0);

//		System.out.println(max);

		for(int i = 0;i<arr.size();i++) {
			if(arr.get(i) > max) {
				secMax = max;
				max = arr.get(i);
			}else if(arr.get(i)>secMax && arr.get(i) != max) {
				secMax = arr.get(i);
			}
		}
		System.out.println(max);
		System.out.println(secMax);
		
	}

}
