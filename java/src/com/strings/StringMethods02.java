package com.strings;

public class StringMethods02 {

	public static void main(String[] args) {
		String st = "";
		String st2 = new String();
		String st3 = null;
		String st4 = " ";
		
		System.out.println(st.length());///0  Returns true if, and only if, length() is 0 .
//
//Specified by: isEmpty() in CharSequence
//Returns:
//true if length() is 0 , otherwise false
		
		
		System.out.println(st.isEmpty());///true
		System.out.println(st.isBlank());///true
		System.out.println("-----------------------");
		System.out.println(st2.isEmpty());
		System.out.println(st2.isBlank());
		System.out.println("-------------------------");
//		System.out.println(st3.isEmpty());   // java.lang.NullPointerException
//		System.out.println(st3.isBlank());   // java.lang.NullPointerException
		
		
		System.out.println("-----------------------");
		System.out.println(st4.isEmpty());
		System.out.println(st4.isBlank());

	}
}
