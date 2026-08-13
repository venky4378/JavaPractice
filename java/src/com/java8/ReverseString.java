package com.java8;


interface In5{
	public abstract String reverse(String s);
	
}
public class ReverseString {
	public static void main(String[] args) {
		
		In5 i2 = (s) ->{
			String rev = "";
			
			for(int i = 0;i<s.length();i++) {
				rev = s.charAt(i) + rev;
			}
			return rev;
		};
		
		System.out.println(i2.reverse("Swamy"));
		
	}
	

}
