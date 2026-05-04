package com.oops;

import java.util.Scanner;

class HealthInsurance extends InsurancePolicy{
	
	@Override
	double calculatePremium() {
		return(sumInsured * 0.02) + (age * 200);	
	}
	@Override
	boolean validateClaim() {
		return age  <= 65;
	}
}

class VehicleInsurance extends InsurancePolicy{
	@Override
	double calculatePremium() {
		return (sumInsured * 0.03);
	}
	@Override
	boolean validateClaim() {
		return true;
	}
}
class LifeInsurance extends InsurancePolicy{
	@Override
	double calculatePremium() {
		return (sumInsured * 0.02)+(age * 200);
		
	}
	@Override
	boolean validateClaim() {
		return age<= 65;
	}
}	
public class InsuranceApp{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select policy type  : ");
		System.out.println("1.Health Insurance");
		System.out.println("2.vehicle Insurance");
		System.out.println("3.Life Insurance");
		
		int choice = sc.nextInt();	
		sc.nextLine();
		
		InsurancePolicy policy;
		
		if(choice == 1) {
			policy = new HealthInsurance();
		}else if(choice == 2) {
			policy = new VehicleInsurance();
		}else {
			policy = new LifeInsurance();
		}
		
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		System.out.println("Enter sumInsured");
		double sumInsured = sc.nextDouble();
		
		policy.setDetails(name, age, sumInsured);
		
		double premium = policy.calculatePremium();
		boolean claimStatus = policy.validateClaim();
		
		System.out.println("Your Details are : ");
		policy.displayDetails();
		System.out.println("Premium : "+ premium);
		
		
		if(claimStatus) {
			System.out.println("Claim Status : Approved");
		}else {
			System.out.println("Claim Status : Rejected");
		}
		
			
		
		
	}
}

