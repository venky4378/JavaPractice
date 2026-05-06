package com.oops;

class Account{
	double calculateInterest() {
		return 0.0;
	}
	
}
class SavingsAccount extends Account{
	@Override
	double calculateInterest() {
		double intrst = 0.6;
		return intrst;
	}
	
}
class CurrentAccount extends Account{
	@Override
	double calculateInterest() {
		double intrst = 0.2;
		return intrst;
	}
	
}

public class BasicBank {
	
	

	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount();
//		double savings = sa.calculateInterest();
		System.out.println(sa.calculateInterest());
		
		CurrentAccount ca = new CurrentAccount();
		System.out.println(ca.calculateInterest());
		
	
		
	}

}
