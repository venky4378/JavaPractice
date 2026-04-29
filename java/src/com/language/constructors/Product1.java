package com.language.constructors;

class ParProduct {
	String name;
	String brand;
	double price;

	ParProduct(String name, String brand, double price) {
		System.out.println("parameterized Constructor called");
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

}

class Laptop1 extends ParProduct {
	String ram;
	String Processor;

	Laptop1(String name, String brand, double price, String ram, String Processor) {
		super(name, brand, price);
		this.ram = ram;
		this.Processor = Processor;

	}

	void display() {
		System.out.println("name : " + name);
		System.out.println("brand : " + brand);
		System.out.println("price : " + price);
		System.out.println("ram : " + ram);
		System.out.println("Processor : " + Processor);
	}

	void applyDiscount(double percentage) {
		price -= (price * (percentage / 100));
	}
}

public class Product1 {

	public static void main(String[] args) {
		Laptop1 l1 = new Laptop1("Nitro", "acer", 50000.00, "526gb", "ryzen 5");
		l1.display();
		System.out.println("-------------------------------------------------------");

		l1.applyDiscount(10);
		l1.display();
		System.out.println("-------------------------------------------------------");
		Laptop1 l2 = new Laptop1("T5 gaming", "Asus", 60000.00, "1TB", "ryzen 5 octa core");
		l2.display();
		System.out.println("-------------------------------------------------------");

		l2.applyDiscount(15);
		l2.display();

		System.out.println("-------------------------------------------------------");

	}

}
