package com.oops;

public class InsurancePolicy {
	
	String policyHolderName;
	int age;
	double sumInsured;

void setDetails(String name,int age,double sumInsured) {
	 this.policyHolderName = name;
	 this.age = age;
	 this.sumInsured = sumInsured;
}
void displayDetails() {
	System.out.println("Name : "+policyHolderName);
	System.out.println("Age : "+ age);
	System.out.println("Sum Insured : "+sumInsured);
}

double calculatePremium() {
	return 0;
}

boolean validateClaim() {
	return false;
}
}
