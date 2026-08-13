package com.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateList {
	
	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(1,2,3,4,5,6);
		
		
		Collections.rotate(li, -8);
		
		System.out.println(li);
	}

}
