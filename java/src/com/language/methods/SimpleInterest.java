package com.language.methods;

public class SimpleInterest {
	
	double calculateSi(double principalAmount,double rateOfInterest,double time) {
		double p = principalAmount;
		double t = time;
		double r = rateOfInterest;
		
		double interestAmount = (p*t*r)/100;
		return interestAmount;
		
	}
	

	public static void main(String[] args) {
		SimpleInterest s = new SimpleInterest();
		double actualAmount = 10000;
		double interestAmount = actualAmount + s.calculateSi(10000,0.2,365);
		
		System.out.println("Interest Amount for 1 year : " + interestAmount);

		
	}

}
