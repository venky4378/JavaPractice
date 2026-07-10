package com.multithreading;

import java.util.Scanner;

//Create 4 threads for perform this
//Thread A prints "Fizz" for numbers divisible by 3 but not by 5.
//Thread B prints "Buzz" for numbers divisible by 5 but not by 3.
//Thread C prints "FizzBuzz" for numbers divisible by both 3 and 5.
//Thread D prints the number itself
//The threads must work together to print the correct FizzBuzz sequence from 1 to n in order.
//Input:- n = 15
//Output:- 1,2, fizz, 4, buzz, fizz, 7,8, fizz......14, fizz buzz.

class ThreadB implements Runnable {
	public void run() {
		for (int i = 15; i < 20; i++) {
			System.out.println("B thread : " + i);
		}
	}
}
class ThreadC implements Runnable {
	public void run() {
		for (int i = 25; i < 30; i++) {
			System.out.println("C thread : " + i);
		}
	}
}
class ThreadD implements Runnable {
	public void run() {
		for (int i = 30; i < 40; i++) {
			System.out.println("D thread : " + i);
		}
	}
}
public class ThreadsDemo06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ThreadD td = new ThreadD();
		ThreadC tc = new ThreadC();
		ThreadB tb = new ThreadB();

		Thread t = new Thread(td);
		Thread t1 = new Thread(tc);
		Thread t2 = new Thread(tb);

		t.start();
		t1.start();
		t2.start();
	}
}
