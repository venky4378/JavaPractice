package com.introductionjava;

public class objcount {
	
	
	static int count = 0;
	objcount(){
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		objcount o1 = new objcount();
		objcount o2 = new objcount();
		objcount o3 = new objcount(); 
		System.out.println("No of Objects:  " + count);
		
	}

}
