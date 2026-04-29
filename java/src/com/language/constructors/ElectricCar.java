package com.language.constructors;

class VehicleSystem{
	VehicleSystem(String brand){
		
		System.out.println("brand : "+ brand);
	}
}
class Car extends VehicleSystem{
	Car(String brand, double price){
		super(brand);
		System.out.println("price : "+ price);
	}
}



public class ElectricCar extends Car {
	ElectricCar(String brand, double price,String battery){
		super(brand,price);
		System.out.println("battery : "+ battery);
	}

	public static void main(String[] args) {
		ElectricCar e1 = new ElectricCar("Mahindra",500000,"1500vh");

		
	}

}
