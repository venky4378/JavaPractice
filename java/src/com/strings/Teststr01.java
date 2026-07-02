package com.strings;

public class Teststr01 {

	public static void main(String[] args) {

		String ch = "Sarayu";
		char[] ch1 = { 'S', 'a', 'r', 'a', 'y', 'u' };
		String data = new String(ch1);

		char[] ch2 = new char[5]; /// initially it gives spaces in the char array of length 5 when we declare
		//

		for (char i : ch2) {
			System.out.print((int) i); // here converting it into 0 when we type cast it will gives 0's
		}
		System.out.println();
 
		String s3 = new String();
		System.out.println(s3); /// space it cannot give the address of the object instead it gives space
		System.out.println(ch);
		System.out.println(data);

		System.out.println(ch.equals(data));//true

		System.out.println(ch == data);  //false
	}

}
