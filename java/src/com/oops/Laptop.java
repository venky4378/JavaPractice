package com.oops;

public class Laptop extends Device {
//		 
//		Laptop(String brand,String power){
//			super(brand,power);
//		}

	void openLid() {
		System.out.println("ewwwwwww");
	}

	@Override
	int getRate() {
		return 500000;
	}

	public static void main(String[] args) {

		Laptop d1 = new Laptop();

		d1.brand = "Apple";
		d1.power = "500mah";
		d1.openLid();
		int rate = d1.getRate();

		System.out.println("Vinay bro watch brand : " + d1.brand);
		System.out.println("Vinay bro power : " + d1.power);
		System.out.println("Child class Rate : " + rate);

	}

}
