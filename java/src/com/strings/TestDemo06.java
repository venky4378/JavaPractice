package com.strings;

import java.util.Scanner;

//1.Write a Java program to capitalize the first letter of every word in a given string.
//Input: hello world
//Output: Hello World


public class TestDemo06 {
	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.println("give me string");
		        String str = sc.nextLine();

		        char[] ch = str.toCharArray();

		        if (ch[0] >= 'a' && ch[0] <= 'z') {
		            ch[0] = (char)(ch[0] - 32);
		        }

		        for (int i = 1; i < ch.length; i++) {
		            if (ch[i - 1] == ' ' && ch[i] >= 'a' && ch[i] <= 'z') {
		                ch[i] = (char)(ch[i] - 32);
		            }
		        }

		        System.out.println(new String(ch));

		        sc.close();
		    
		}
		
	}


