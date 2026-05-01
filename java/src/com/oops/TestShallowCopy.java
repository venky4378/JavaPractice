package com.oops;

class Test implements Cloneable {

	String sname;
	int sid;
	Address address;

	public Test(String sname, int sid, Address address) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.address = address;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();

	}
}

class Address {
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}

} 

public class TestShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("Hyderabad");
		Test t1 = new Test("Venky", 12, address);
		Test t2 = (Test) t1.clone();
		t1.address.city = "Banglore";

		System.out.println("Name : " + t1.sname);
		System.out.println("Id :" + t1.sid);
		System.out.println("Address : " + t1.address.city);
		System.out.println("---------------------------------------");
		System.out.println("Name : " + t2.sname);
		System.out.println("Id :" + t2.sid);
		System.out.println("Address : " + t2.address.city);

	}

}
