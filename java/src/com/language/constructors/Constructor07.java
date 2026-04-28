package com.language.constructors;

public class Constructor07 {
	int num1;
	int num2;
	String Employee_name;
	int horse_power;
	
	Constructor07(int num1){
		this(768,"BMW",12000);
		System.out.println("one arg");
	}
	Constructor07(int num2,String Employee_name,int horse_power){
		
		this.num2 = num2;
		this.Employee_name = Employee_name;
		this.horse_power=horse_power;
		System.out.println("params");
		
	}

	public static void main(String[] args) {
		
		Constructor07 c2 = new Constructor07(11);

		
	}

}
