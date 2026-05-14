package com.oops.abstraction;

import java.util.Scanner;

//B70 java- Create an interface Product with method:buy(int quantity)
//Create classes:
//Electronics
//Clothing
//Grocery
//Requirements:
//Each class should implement Product
//Add properties in each class
//Display product details and total bill
//Create a main class ShoppingCart:
//Create objects of all classes
//Call buy() method for each object
//Demonstrate interface implementation and method overriding 

public interface Product {
	public Scanner sc = new Scanner(System.in);
	public void buy(int quantity);

}
