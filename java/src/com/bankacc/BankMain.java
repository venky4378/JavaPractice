package com.bankacc;

import java.util.Scanner;

public class BankMain {
	static Integer amount ;
	static Integer balance = 5000;
	
	
	public static void withdraw(Integer amount) throws InvalidAmountException,InsufficentBalanceException {
		if(amount <= 0) {
			throw new InvalidAmountException("Invalid Amount");
		}else if(amount > balance) {
			throw new InsufficentBalanceException("Insufficient Funds");
		}else {
			balance = balance - amount;
			
			System.out.println("Your withdrawl amount is : "+ amount);
			System.out.println("Your Balance After withdrawl : "+balance);
		}
	}
	
	public static void main(String [] args) throws InvalidAmountException,InsufficentBalanceException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		amount = sc.nextInt();
		
		withdraw(amount);
		
		
		
		
	}

}
