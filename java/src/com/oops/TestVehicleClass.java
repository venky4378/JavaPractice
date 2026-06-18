package com.oops;

public class TestVehicleClass {

	public static void main(String[] args) {
		VehicleModel v = new VehicleModel();

		v.setOwnerName("Sunil");
		v.setVehicleType("Buller");
		v.setVehicleNumber(2345);

		System.out.println(v.getOwnerName());
		System.out.println(v.getVehicleType());
		System.out.println(v.getVehicleNumber());

	}
}
