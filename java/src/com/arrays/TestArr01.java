 package com.arrays;

import java.util.Scanner;

//a[] = {10, 20, 30, 40, 50}
//b[] = {1, 2, 3}
//*Output:
//11 22 33 40 50
public class TestArr01 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		

		int arr[] = {10,20,30,40,50};
		int arr2[] = {1,2,3};
		
		int leng = Math.max (arr.length, arr2.length);
		
		int[] result = new int[leng];
		
		for(int i = 0;i<leng;i++) {
			if(i<arr.length && i<arr2.length) {
				result[i] = arr[i] + arr2[i];
			}
			else if(i<arr.length) {
				result[i] = arr[i];
			}
			else {
				result[i] = arr2[i];
			}
		}
		
		for(int a: result) {
			System.out.print(a + " ");
		}
		
		
				
		
		
	}

}
