package com.gut;
import java.util.Scanner;

class BinarySearch01{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr = {10,20,30,40,50,60};
		int low  =0;
		int high = arr.length-1;
		System.out.println("Enter target element");
		int target = sc.nextInt();
		int index = -1;
		
		while(low<=high) {
			int mid = (low + high)/2;
			if(target == arr[mid]) {
				index = mid;	
				break;
			}else if(target<mid) {
				high = mid -1;
			}else if(target>mid) {
				low = mid +1;
			}
		}
		if(index != -1) {
			System.out.println("Found Element : "+ index);	
		}else {
			System.out.println("Element Not Found");
		}
	}
}