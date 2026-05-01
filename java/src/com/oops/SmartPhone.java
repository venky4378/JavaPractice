package com.oops;

public class SmartPhone extends Device {
	
	SmartPhone(String brand, String power) {
		super(brand, power);
		// TODO Auto-generated constructor stub
	}

	void makeCall() {
		System.out.println("ask me to call");
	}

	public static void main(String[] args) {

		SmartPhone d2 = new SmartPhone("Mega max","10000mah");
		
		
		
//		d2.brand = "Oneplus 11 r";
//		d2.power = "6000mah";
//		System.out.println("Smartphone brand : "+d2.brand);
//		System.out.println("Power : "+ d2.power);
		
	}

}
