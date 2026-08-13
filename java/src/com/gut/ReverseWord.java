package com.gut;

public class ReverseWord {
	
	public static void main(String[] args) {
		String str = "Java Full Stack";
		
		String[] str2 = str.split(" ");
		
		for(int i = 0;i<str2.length;i++) {
			StringBuilder str3 = new StringBuilder();
			str3.append(str2[i]);
			System.out.print(str3.reverse() + " ");
		}
	}
	

}
