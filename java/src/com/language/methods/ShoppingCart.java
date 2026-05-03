package com.language.methods;

public class ShoppingCart {
	static double price;
	static int Quantity;
	static int item=0;
	double totalAmount(double price,int quantity) {
		this.Quantity = quantity;
		double totalPrice = price * quantity;
		double discount = ((totalPrice/1500) * 300);
		price = totalPrice - discount;
		return price;
	}
	public static void main(String[] args) {
		Quantity = item++;
		ShoppingCart s = new ShoppingCart();
		double finableAmount = s.totalAmount(2000, 2);
		System.out.println("Amount payable : "+ finableAmount);
		System.out.println("Items:"+Quantity);
	}

}


//package com.language.methods;
//
//public class ShoppingCart {
//
//    static int item = 0;
//
//    double totalAmount(double price, int quantity) {
//        item++;
//
//        double totalPrice = price * quantity;
//        double discount = (totalPrice / 1500) * 300;
//
//        return totalPrice - discount;
//    }
//
//    public static void main(String[] args) {
//        ShoppingCart s = new ShoppingCart();
//        double finalAmount = s.totalAmount(2000, 1);
//
//        System.out.println("Amount payable : " + finalAmount);
//        System.out.println("Items: " + item);
//    }
//}
