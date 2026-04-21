package com.language.constructors;

public class Constructors02 {
	
	
	int cid;
	String cname;
	int cage;
	long phone;
	
	///for no arg constructor variable;
	int id3;
	String rollno;
	

	
	Constructors02(){
		System.out.println("No arg parameterized called");
		id3 = 00000;
		rollno = "0xxxxxxx0";
		
	}
	
	// Parameterized Constructor
	
	Constructors02(int cid,String cname,int cage, long phone){
		System.out.println("Parameterized Constructor called");
		this.cid = cid;
		this.cname = cname;
		this.cage = cage;
		this.phone = phone;
		
	}
	
	//By using the parameterized constructors we are initializing the values of instance data at the time of object creation only
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Constructors02 c1 = new Constructors02(102,"mahesh",23,9876543234L);
		c1.show();
		
		
		Constructors02 c2 = new Constructors02(23,"Marke",43,9876545678L);

		c2.show();
		
		Constructors02 c3 = new Constructors02();
		
		System.out.println("main method ended");
	

		
	}
	void show() {
		System.out.println("Customer id : " + cid);
		System.out.println("Customer name : "+ cname);
		System.out.println("Customer age : " + cage);
		System.out.println("Customer Number : "+ phone);
	}

}
