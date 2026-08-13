package com.java8;

public class Product {
	
	int productId;
	String productName;
	String category;
	double price;

	public Product(int productId, String productName, String category, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}

	public static void main(String[] args) {
		
		Product p1 = new Product(101,"Sai teja","Laptop",80000.0);
		Product p2 = new Product(102,"Mahesh","Mac",78000.00);
		Product p3 = new Product(103,"Kumar","Iphone",9000.00);
		
		
		Product arr[] = {p1,p2,p3};
		
		
		for(Product pr:arr) {
			
			
		}
		
	}
	

}
