package com.conditions.loops;

public class CountEvenOrOdd {

	public static void main(String[] args) {
		int evenCount= 0;
		int oddCount = 0;
		
		for(int i = 0;i<=50;i++) {
			if(i % 2 == 0) {
				evenCount += 1;				
			}else {
				oddCount +=1;
			}
		}
		System.out.println("Even count : "+ evenCount);
		System.out.println("Odd Count : "+ oddCount);
	}

}
