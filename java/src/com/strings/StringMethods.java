package com.strings;

public class StringMethods {

	public static void main(String[] args) {

		String sent = "Java is Simple in vcube in jntu";
		
		char[] ch = new char[10];
		
		sent.getChars(0,6,ch,0);
		
		for(char c:ch) {
			System.out.print(c);
		}
		
		System.out.println(sent.indexOf('i'));
		System.out.println("Second Index values is : "+ sent.indexOf('i', sent.indexOf('i')+1));
		System.out.println("Third Index of I is : "+ sent.indexOf('i' ,sent.indexOf('i',sent.indexOf('i') + 1)+1));
		System.out.println("---------------------------");
		
		System.out.println("String value of in : "+ sent.indexOf("in"));
		System.out.println("String value of 2nd in : "+ sent.indexOf("in",sent.indexOf("in")+1));
		
		String s = "navya";
		String s1  = new String("navya");
//		String s1 = new String("navya").intern();//converting heap to SCP is the concept of  intern
		System.out.println(s==s1);
	}

}
