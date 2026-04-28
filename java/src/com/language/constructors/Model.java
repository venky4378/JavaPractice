package com.language.constructors;

public class Model {
	String brand;
	String model1;
	int price;
	String color;
	
	Model(){
		brand = "unknown";
		model1 = "unknown";
		price = 0;
		color = "unknown";
	}
	Model(String brand,String model1){
		this(brand,model1,0);
		
	}
	Model(String brand,String model1,int price){
		this(brand,model1,price,"unknown");
	}
	
	Model(String brand,String model1,int price,String color){
		this.brand = brand;
		this.model1 = model1;
		this.price = price;
		this.color = color;
	}
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("----------------------------------------");
		Model m1 = new Model();
		m1.display();
		System.out.println("----------------------------------------");

		Model m2 = new Model("Lenovo","thinkpad");
		m2.display();
		System.out.println("----------------------------------------");

		
		Model m3 = new Model("Dell","iq",500000);
		m3.display();
		System.out.println("----------------------------------------");

		Model m4 = new Model("Lenovo","thinkpad",7000000,"red");
		m4.display();
		
	}
	void display() {
		System.out.println("brand : "+ brand);
		System.out.println("model1 : "+ model1);
		System.out.println("price : "+ price);
		System.out.println("Color : "+ color);
		 
	}

}
