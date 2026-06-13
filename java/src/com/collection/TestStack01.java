package com.collection;

import java.util.Stack;
public class TestStack01 {

	//Stack follows LIFO Last in First out
	public static void main(String[] args) {
		
		Stack<String> li = new Stack<>();
		
		li.push("Hello");
		li.push("How");
		li.push("Venky");
		li.push("Whats's");
		li.push("On");
		
		
		li.pop();     //removing the top element on the stack
		
		System.out.println(li.peek());		//gettig the top element object
		
		System.out.println(li);
		
	}
}
