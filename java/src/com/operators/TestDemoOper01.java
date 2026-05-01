package com.operators;

public class TestDemoOper01 {
	int a;
	int b;
	
	
	int add(int a,int b) {
		int sum = a + b;
		return sum;
	}
	
	int sub(int a,int b) {
		int difference = a - b;
		return difference;
	}
	
	double multiple(double a,double b) {
		double product = a * b;
		return product;
	}
	double division(double a,double b) {
		double qoutient = a / b;
		return qoutient;
	}

	public static void main(String[] args) {
		TestDemoOper01 t1 = new TestDemoOper01();
		double sum = t1.add(10, 20);
		double difference = t1.sub(30,20);
		double product = t1.multiple(25.5,7.8);
		double quatient = t1.division(125.5,5.5);
		
		System.out.println("Sum : "+sum);
		System.out.println("difference : "+difference);
		System.out.println("product : "+ product);
		System.out.println("Quatient : "+quatient);

	}

}
