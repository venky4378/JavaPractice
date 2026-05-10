package com.conditions.loops;

public class TestLoops01 {

	public static void main(String[] args) {

		int[] arr = {1,2,3};
		
		for(int i =0;i<arr.length;i++) {
			i = i*2;
		}
		for(int i:arr) {
			i =i+1;
			
		}
//		System.out.println(i);
	}

}
