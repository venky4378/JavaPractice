package com.collection;

import java.util.Collection;
import java.util.ArrayList;

public class EvenorOdd {

	public static void main(String[] args) {

		int evenCount = 0;
		int oddCount = 0;
		Collection<Integer> c1 = new ArrayList<>();
		
		c1.add(10);
		c1.add(15);
		c1.add(30);
		c1.add(25);
		c1.add(32);
		c1.add(43);
		c1.add(11);
		
		for(int i:c1) {
			if(i % 2 == 0) {
				evenCount++;
			}else if(i % 2 != 0){
				oddCount++;
			}
		}
		System.out.println("Even count : "+evenCount);
		System.out.println("Odd Count : " + oddCount);
	}

}
