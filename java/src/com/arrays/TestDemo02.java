package com.arrays;
class TestDemo02 {

	public static void main(String[] args) {
		
		int [] arr  = {12,23,34,45,6,298,768,43};
		
		int secMax = arr[0];
		int max = arr[0];
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > max) {
				secMax = max;
				max = arr[i];
			}else if(arr[i] > secMax && arr[i] != max) {
				secMax = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secMax);
	}
}