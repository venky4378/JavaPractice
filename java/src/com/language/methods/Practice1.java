package com.language.methods;

class MathUtil{
	
	static int add(int a,int b) {
		
		
		int sum = a+b;
		return sum;
	}
}




public class Practice1 {
	
	
	public static void main(String[] args) {
		
		int result = MathUtil.add(5,6);
		System.out.println("Sum of two numbers : " + result);
		
		
	}

}
