package com.language.methods;

import java.util.Scanner;

public class FoodOrder {

	void materials(double price, double quantity, double deliveryCharge, double discount) {

		double totalAmount = price * quantity;
		double discountAmount = (totalAmount * discount) / 100;

		double afterDiscount = totalAmount - discountAmount;

		double totalBill = afterDiscount + deliveryCharge;

		System.out.println("Total bill  : " + totalBill);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Give me price : ");
		double price = sc.nextDouble();
		System.out.println("Give me quantity : ");
		double quantity = sc.nextDouble();
		System.out.println("delivery Charge : ");
		double deliveryCharge = sc.nextDouble();
		System.out.println("Give me discount : ");
		double discount = sc.nextDouble();

		FoodOrder f = new FoodOrder();

		f.materials(price, quantity, deliveryCharge, discount);

	}

}
