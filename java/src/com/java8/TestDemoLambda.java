package com.java8;

interface In1 {
	public int calculate(int a, int b);
}

interface In1Impl extends In1 {
}

public class TestDemoLambda {
	public static void main(String[] args) {

		//subtractions using the Lambda expressions
		In1 i = (a, b) -> a - b;
		System.out.println("Subtract : "+i.calculate(5, 3));
		
		//Multiple using lambda expressions
		In1 i1 = (a,b) -> a*b;
		System.out.println("Multiply : "+i1.calculate(5, 3));
		
		//5.Write a lambda expression to divide two numbers.
		In1 i2 = (c,d) ->c/d;
		System.out.println("Division : " +i2.calculate(10,5));

	}

}
