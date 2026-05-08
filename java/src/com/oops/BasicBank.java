package com.oops;

class Account{
	double calculateInterest(double  amount) {
		return 0.0;
	}
	
}
class SavingsAccount extends Account{
	@Override
	double calculateInterest(double amount) {
		double intrst = ((6* amount)/100);
		double totalAmount = amount + intrst;
		return totalAmount;
	}
	
}
class CurrentAccount extends Account{
	@Override
	double calculateInterest(double amount) {
		double intrst = ((2*amount)/100);
		double totalAmount = amount + intrst;
		return totalAmount;
	}
	
}

public class BasicBank {
	
	

	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount();
//		double savings = sa.calculateInterest();
		double amount1 = sa.calculateInterest(50000.00);
		
		CurrentAccount ca = new CurrentAccount();
		double amount2 = ca.calculateInterest(100000.00);
		
		System.out.println("For 6 % interest of Savings account : "+ amount1);
		System.out.println("For 2 % interest of Current account : "+ amount2);

		
	
		
	}

}
