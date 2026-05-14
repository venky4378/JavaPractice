package com.oops.projects;

public class User {

	public User(int accno, double d, String userName, int pin) {
		super();
		this.accno = accno;
		this.balance = d;
		this.userName = userName;
		this.pin = pin;
	}

	int accno;
	double balance;
	String userName;
	int pin;

	User u;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double depo) {
		this.balance = depo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

}
