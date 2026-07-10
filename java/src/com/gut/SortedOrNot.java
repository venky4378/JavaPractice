package com.gut;

public class SortedOrNot {
	
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		boolean flag = true;
		
		
		for(int i =1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				flag = false;
			}else {
				flag = true;
			}
		}
		System.out.println(flag);
	}

}
