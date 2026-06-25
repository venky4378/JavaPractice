package com.strings;

public class ObjectArray1 {
	public static int findSum(Object[] arr) {
		int sum = 0;
		
		for(Object obj2:arr) {
			if(obj2 instanceof Integer) {
				sum += (Integer) obj2;
			}else if(obj2 instanceof Object) {
				sum += findSum((Object[])obj2);
			}
			
		}return sum;
		}

	public static void main(String[] args) {

		
		Object[] obj = {10,new Object[] {23,56,66,new Object[] {30}}};
		
		System.out.println(findSum(obj));
	
		
	}

}
