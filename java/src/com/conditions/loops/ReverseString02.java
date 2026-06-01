package com.conditions.loops;

//Reverse Array by using string
public class ReverseString02 {

	public static void main(String[] args) {
		
		String[] b = {"Navya sri"};
		
		for(int i = 0;i<b.length;i++) {
			String rev = " ";
			for(int j = b[i].length()-1;j>0;j--) {
				rev += b[i].charAt(j);
			}
			System.out.println(rev);
		}
		
		

		
	}

}
