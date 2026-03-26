package com.introductionjava;

class Demo2{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}
	
}

public class TestDemo6 {
	
	static void obj1() {
		System.out.println("obj method called");
		Demo2 s1 = new Demo2();
	}

	public static void main(String[] args) {
		System.out.println("main method called");
		
		Demo2 d1 = new Demo2();
		Demo2 d2 = new Demo2();
		Demo2 d3 = new Demo2();
		d1 = null;
		d2 = d1;
		new Demo2();
		obj1();
		
		System.gc();
		System.out.println(d1);  //o@1dbd16a6

		System.out.println(d2);  //@7ad041f3
		
		System.out.println(d3);
		
}
}