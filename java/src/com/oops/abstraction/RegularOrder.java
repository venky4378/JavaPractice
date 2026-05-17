package com.oops.abstraction;

public class RegularOrder extends FoodOrder {
	public RegularOrder(int orderId, String customerName, double itemPrice) {
		super(orderId, customerName, itemPrice);
		// TODO Auto-generated constructor stub
	}

	static double deliveryCharge;
	static double discount;
	static double netAmount;

	public static void main(String[] args) {

		FoodOrder ro = new RegularOrder(1234, "Venky", 550.00);
		deliveryCharge = ro.calculateDeliveryCharge();
		discount = ro.applyDiscount();
		netAmount = (deliveryCharge + +ro.itemPrice) - ro.applyDiscount();
		ro.generateBill();
		
	}

	@Override
	public double applyDiscount() {
		double discount = 0.05 * itemPrice;
		return discount;
	}

	@Override
	public double calculateDeliveryCharge() {
		double deliveryCharge = itemPrice * 0.10;
		return deliveryCharge;
	}

	@Override
	public void generateBill() {
		System.out.println("Item price : " + itemPrice);
		System.out.println("Delivery charge : " + deliveryCharge);
		System.out.println("Disocunt applied : " + discount);
		System.out.println("Total Bill Payable : "+ netAmount );

	}
}
