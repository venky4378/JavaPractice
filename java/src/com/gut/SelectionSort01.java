package com.gut;

public class SelectionSort01 {
	public static void main(String[] args) {
		int[] arr = {64,25,12,22,11};
		int temp = 0;
		
		for(int i = 0;i<arr.length;i++) {
			int minIndex = i;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		for(int a:arr) {
			System.out.print(a + " ");
		}
	}

}
