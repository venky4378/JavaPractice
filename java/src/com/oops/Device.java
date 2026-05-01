package com.oops;

public class Device {
	String brand;
	String power;
	
//	Device(String brand,String power){
//		this.brand = brand;
//		this.power = power;
//		System.out.println("brand : "+ brand);
//		System.out.println();
//	}
	
	void showDetails() {
		System.out.println("brand :"+brand);
		System.out.println("power : "+ power);
		
	}
	
	
	int getRate() {
		return 100000;
	}

}
