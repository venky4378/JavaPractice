package com.introductionjava;

public class TestDemo2 {
	 
	@Override
	protected void finalize() throws Throwable {
		  System.out.println("finalize called");
	}
	static void stat() {
		TestDemo2 t4 = new TestDemo2();
		System.out.println("t4 object");
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		TestDemo2 t1 = new TestDemo2();
		
		TestDemo2 t2  = new TestDemo2();
		TestDemo2 t5  = new TestDemo2();
		
		
		
		
		//Nullyfying References
		System.out.println("main method started");
		
		 t1 = null;
			System.out.println(t1);

		 
		//Reassigning references
		 t2 = t1;
			System.out.println(t2);

		 t5.stat();
		 
		 System.gc();  
		
		
		
		//Anonymous Objects
		
		
			
	}

}
