package com.exception;

class Multi1 implements Runnable{
	
	public void run() {
		
		for(int i = 65;i<90;i++) {
			System.out.print((char)i);
		}
	}
}

public class MultipleThreads implements Runnable{

	@Override
	public void run() {
		for(int i = 10;i<15; i++) {
			System.out.print(i);
		}
		
	}
	public static void main(String[] args) {
		
		MultipleThreads m1 = new MultipleThreads();
		Multi1 m2 = new Multi1();
		Thread t1 = new Thread(m1);
		System.out.println();

		Thread t2 = new Thread(m2);
		t1.run();
		t2.run();
		
	}
	
	
	

}
