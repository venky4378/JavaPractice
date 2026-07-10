package com.multithreading;

import java.util.Scanner;

class Resource {

	int i = 0;
	boolean status = false;

	synchronized void put(int i) throws InterruptedException {
		if (status) {
			wait();
		}
		this.i = i;
		System.out.println("Put1 : " + i);
		status = true;
		notify();

	}

	synchronized void get() throws InterruptedException {
		if (!status) {
			wait();
		}
		System.out.println("Get1 : " + i);
		status = false;
		notify();
	}

} 

class Producer implements Runnable {
	Resource r;

	Producer(Resource r) {
		this.r = r;
		Thread t = new Thread(this, "producer");
		t.start();
	}

	public void run() {

		int i = 1;

		while (true) {
			try {
				r.put(i++);

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class Consumer implements Runnable {
	Resource r;

	Consumer(Resource r) {
		this.r = r;
		Thread t = new Thread(this, "consumer");
		t.start();

	}

	public void run() {

		while (true) {

			try {
				r.get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}

public class ProducerConsumer01 {
	String name;

	public static void main(String[] args) {
		Resource r = new Resource();
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);

	}

}
