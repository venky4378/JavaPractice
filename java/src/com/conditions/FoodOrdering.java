package com.conditions;

import java.util.Scanner;

public class FoodOrdering {

	public static void main(String[] args) {
		String yn;
		String ordered = " ";

		do{System.out.println("Welcome to food Ordering ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Give item of pizza or Burger or Drink");
		String item = sc.next();

		switch (item) {
		case "pizza" -> {
			System.out.println("Select veg or non veg");
			String type = sc.next();
			switch (type) {
			case "veg" -> System.out.println(ordered += "Veg pizza");
			case "nonveg" -> System.out.println(ordered += "Non Veg pizza");
			default -> System.out.println("Not Available that type");
			}
		}
		case "burger" -> {
			System.out.println("Which type veg or non veg");
			String type = sc.next();
			switch (type) {
			case "veg" -> System.out.println(ordered += "Veg Burger");
			case "nonveg" -> System.out.println(ordered += "Non Veg Burger");
			default -> System.out.println("Not Available that type");
			}
		}
		case "drinks" -> {
			System.out.println("Which type of drinks : coke / juice");
			String type = sc.next();
				switch (type) {
				case "coke" -> System.out.println(ordered += "coke");
				case "juice" -> System.out.println(ordered += "juice");
				default -> System.out.println("Not available that type of drinks");

				}
			

		}
		default -> System.out.println("Those Items are not available");

		}
		System.out.println("Ordered foods are : "+ ordered);
		System.out.println("Do you order any : ");
		yn = sc.next();
		}while(yn.equalsIgnoreCase("Y"));

	}
}