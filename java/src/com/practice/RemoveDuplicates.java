package com.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,3,2,5,5,6,7,8,9};

		for (int i = 0; i < arr.length; i++) {

		    boolean alreadyPrinted = false;

		    for (int k = 0; k < i; k++) {
		        if (arr[i] == arr[k]) {
		            alreadyPrinted = true;
		            break;
		        }
		    }

		    if (alreadyPrinted)
		        continue;

		    for (int j = i + 1; j < arr.length; j++) {
		        if (arr[i] == arr[j]) {
		            System.out.println(arr[i]);
		            break;
		        }
		    }
		}
		
	}

}
