
package com.multithreading;

class Resource01 {

	int i = 0;
	boolean status = false;

	synchronized void put(int i) throws InterruptedException {

		if (status) {
			wait();
		}
		this.i = i;
		System.out.println("Put : " + i);
		status = true;
		notify();

	}

	synchronized void get() throws InterruptedException {
		if (!status) {
			wait();
		}
		System.out.println("Get : " + i);
		status = false;
		notify();
	}

}

class Producer01 implements Runnable {

	Resource01 r;

	Producer01(Resource01 r) { 
		this.r = r;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	@Override
	public void run() {
		int i = 1;
		while (true) {
			try {
				r.put(i++);

				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class Consumer01 implements Runnable {

	Resource01 r;

	Consumer01(Resource01 r) {
		this.r = r;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public void run() {

		int i = 1;

		while (true) {

			try {
				r.get();

				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class ThreadDemo02 {

	public static void main(String[] args) {

		Resource01 r = new Resource01();
		Producer01 p = new Producer01(r);
		Consumer01 c = new Consumer01(r);
	}

}