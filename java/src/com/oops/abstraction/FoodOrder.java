package com.oops.abstraction;

public abstract class FoodOrder implements Discountable{
	int orderId;
	String customerName;
	double  itemPrice;
	
	public FoodOrder(int orderId, String customerName, double itemPrice) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.itemPrice = itemPrice;
	}

	void generateBill() {
		
	}
	
	public abstract double calculateDeliveryCharge();
	
	@Override
	public double applyDiscount() {
		double discount = 0; 
		
		return discount;
	}
	
}




