package com.arrays;

public class TestArr2d {

	public static void main(String[] args) {

		int[] a = { 10, 20, 40, 50 };
		int[] b = { 1, 2, 3 };
		int length1 = Math.max	(a.length , b.length);

		int[] result = new int[length1];

//		System.out.println(length1);
		for (int i = 0; i < length1; i++) {
			if (i<a.length && i<b.length) {
				result[i] = a[i]+ b[i];
			}
			else if(i<a.length) {
				result[i] = a[i];
			}else {
				result[i] = b[i];
			}
			
		}
		for(int c:result) {
			System.out.print(c + " ");
		}
		
	}

}
