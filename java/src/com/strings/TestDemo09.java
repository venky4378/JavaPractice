package com.strings;

public class TestDemo09 extends Thread {

	public static void main(String[] args) throws InterruptedException {

		TestDemo09 t1 = new TestDemo09();
		t1.start();
		
		for (int i = 1; i < 50; i++) {
			
			Thread.sleep(1000);
			System.out.println("from main "+i);
		}
		System.out.println("---------------------------");
//		System.out.println(Thread.currentThread());
//		System.out.println(t1.getName());

	}

	public void run() {
		for (int i = 50; i < 100; i++) {
			
			try {
				Thread.sleep(10000);
				System.out.println("from run "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
}
