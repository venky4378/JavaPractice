package com.encapsulation;

public class TestDemoEncap01 {

	public static void main(String[] args) {
		Testoops01 t1 = new Testoops01();
		t1.setId(10);
		t1.setName("Venky");
		t1.setNo(7890000009L);
		System.out.println("Id :"+t1.getId());
		System.out.println("Name : "+ t1.getName());
		System.out.println("Phone Number : "+t1.getNo());
	}

}
