package com.strings;

public class StringMethods03 {
	
	public static void main(String[] args) {
		String str = String.join("-", "Java","is","Simple","in","Vcube");
		System.out.println(str);
		
		String str2 = "Sai teja is mouth in his mouth";
		int count = 0;
		String[] str3 = str2.split("\\s",4);
		for(String s:str3) {
			count++;
			System.out.println(s);
		}
		System.out.println(count);
		System.out.println("-------------------------------");
		String f = "Java is Simple By Srikanth";
		System.out.println(f);
		System.out.println("----------------------");
		f = f.replace("Java","Spring");
		System.out.println(f);
		
		//when we want to make numbers into some XXXXXXX or ************ like these then we can use like this
		String s = "Java v8Engine 630retyrn 0987765";
		
		s= s.replaceAll("\\d", "*");
		System.out.println(s);
		System.out.println("--------------------");
		String s2 = "ABRDGERSDFAS889900MSXND908";
		s2 = s2.replaceAll("\\D", "S");        //Non Digits - will be replaced with the S "\\D" denotes the no digit characters
		System.out.println(s2);
				
		
	}
}
