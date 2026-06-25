package com.practice;

public class TestArrays07 {
	
	public static int findSum(Object[] obj1){
		int sum = 0;
		for(Object obj:obj1) {
			if(obj instanceof Integer) {
			sum += (Integer)obj;
			}else if(obj instanceof Object) {
			sum += findSum((Object[]) obj); 
		}
	}
	return sum;
	}

	public static void main(String[] args) {
		Object[] obj1 = { 10, new Object[] { 20, 30, new Object[] { 40, 50 } } };

		findSum(obj1); 
		System.out.println(findSum(obj1));

	}
}
