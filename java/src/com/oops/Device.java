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
	
	public Device(String brand2, String power2) {
		this.brand = brand;
		this.power = power2;
		// TODO Auto-generated constructor stub
	}


	void showDetails() {
		System.out.println("brand :"+brand);
		System.out.println("power : "+ power);
		
	}
	
	
	int getRate() {
		return 100000;
	}

}
