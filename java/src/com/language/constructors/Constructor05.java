package com.language.constructors;

public class Constructor05 {
	
	
	String brand;
	double price;
	
	
	Constructor05()
	{
		brand = "Mahindra";
		price = 2456870.090;
	}
	
	void display() {
		System.out.println("The Brand of the car : "+ brand);
		System.out.println("The Price of the car : "+ price);
	}
	
	public static void main(String[] args) {
		
		
		Constructor05 c = new Constructor05();
		c.display();
		

		
		
	}

}


//Access Modifiers  class   Interface   innerclass    static-instance variables    methods     constructors  blocks
- Private 			
-default
-protected
- Public