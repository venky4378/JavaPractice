package com.multithreading;

class DThread extends Thread{
	
	
	public void run() {
		
		for(int i = 0;i<10;i++) {
			
			
			System.out.println(i);
		}
		 	
	}
}

public class ThreadDemo03 {
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		DThread d = new DThread();
		d.setDaemon(true);
		d.start();
		
		for(int i = 10;i<20;i++) {
			System.out.println(i);
		}
		
		
		
		
	}

}
