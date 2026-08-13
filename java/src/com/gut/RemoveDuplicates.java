package com.gut;

class RemoveDuplicates{
	public static int removeDuplicates(int[] arr){
		int i = 0;
		for(int j = 1;j<arr.length;j++) {
			if(arr[i] != arr[j]) {
				System.out.println(arr[i]);
				i++;
				arr[i] = arr[j];
			}
		}
		return i +1;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,4,4};
		int length = removeDuplicates(arr);
		
		System.out.println("length of duplicates are : "+ length);
	}
}