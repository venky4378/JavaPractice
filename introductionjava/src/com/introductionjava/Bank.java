package com.introductionjava;

public class Bank {
			//instance variables
			int accountNumber;
			String accountHolderName;
			int accountBalance;
			
			//static variables
			
			static String bankName;
			static  String branch;
		

	public static void main(String[] args) {
		
		Bank no = new Bank();
		Bank no2 = new Bank();
		Bank no3 = new Bank();
		
		no.accountNumber = 1234567889;
		no.accountHolderName = "Venky";
		no.accountBalance = 789876;
		
		no2.accountNumber = 23456789;
		no2.accountHolderName = "Swamy";
		no2.accountBalance = 289036;
		
		no3.accountNumber = 3456789;
		no3.accountHolderName = "Sai Teja";
		no3.accountBalance = 890868;
		
		
		
		
		
		
		
		 
		bankName = "HDFC";
		branch = "Kukatpally";
		
		System.out.println("First Person Balance");
		System.out.println(no.accountNumber);
		System.out.println(no.accountHolderName);
		System.out.println("rupees: "+no.accountBalance);
		System.out.println(bankName);
		System.out.println(branch);
		
		System.out.println("Second Person Details");
		System.out.println(no2.accountNumber);
		System.out.println(no2.accountHolderName);
		System.out.println(no2.accountBalance);
		System.out.println(bankName);
		System.out.println(branch);
		
		System.out.println("Third Person Details");
		System.out.println(no3.accountNumber);
		System.out.println(no3.accountHolderName); 
		System.out.println(no3.accountBalance);
		System.out.println(bankName);
		System.out.println(branch);
		
		



	}

}
