package com.collection;

public class MobileCompare {

	
	String mobile;
	String brand;
	int price;

	@Override
	public String toString() {
		return "MobileCompare [mobile=" + mobile + ", brand=" + brand + ", price=" + price + "]";
	}
	
	public MobileCompare(String mobile, String brand, int price) {
		super();
		this.mobile = mobile;
		this.brand = brand;
		this.price = price;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
		
}
