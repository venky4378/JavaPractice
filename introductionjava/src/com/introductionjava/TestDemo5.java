package com.introductionjava;

class Demo{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}
	
}

public class TestDemo5 {
	
	static void obj1() {
		System.out.println("obj method called");
		Demo s1 = new Demo();
	}

	public static void main(String[] args) {
		System.out.println("main method called");
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		d1 = null;
		d2 = d1;
		new Demo();
		obj1();
		
		System.gc();
		System.out.println(d1);  //o@1dbd16a6

		System.out.println(d2);  //@7ad041f3
		
		System.out.println(d3);
		
}
}
