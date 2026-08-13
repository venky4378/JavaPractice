package com.java8;


interface In6{
	public String  isLeapYearOrNot(int n);
}

public class LeapYearLambda01 {
	public static void main(String[] args) {
	
	In6 i4 = (n) ->{
		
		if((n % 400 == 0)|| ((n % 4 == 0) && (n % 100 != 0))) {
			return "Leap Year";
		}else {
			return "Not Year";
		}
	};

	System.out.println(i4.isLeapYearOrNot(2024));
}
}
