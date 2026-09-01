package com.gut;

import java.util.concurrent.locks.ReentrantLock;

class BankDemo {
	private int balance = 10000;

	private final ReentrantLock lock = new ReentrantLock();

	public void withdraw(int amount, String threadName) {

		lock.lock();

		try {
			if (balance >= amount) {
				System.out.println(threadName + " is withdrawing " + amount);
				balance = balance - amount;

				System.out.println(threadName + "WIthdrawl successful remaining amount : " + balance);
				System.out.println("---------------------------------------------------");
			} else {
				System.out.println(threadName + "Insufficient Funds");
			}
		} finally {
			lock.unlock();
		}
	}

	public int getBalance() {
		return balance;
	}

}

	public class BankAccount{

	void main() {
		BankDemo account = new BankDemo();

		Thread t1 = new Thread(() -> {
			account.withdraw(4000, "Thread1");
		});

		Thread t2 = new Thread(() -> {
			account.withdraw(500, "Thread2");
		});
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Final Balance : " + account.getBalance());
	}

}
