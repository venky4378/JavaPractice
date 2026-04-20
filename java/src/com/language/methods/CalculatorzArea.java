package com.language.methods;

import java.awt.SystemTray;
import java.util.Scanner;

class Area{
	
	
	//area of traingle = 0.5 * b * h
	//area of square = side * side 
	//area of rectangle = length * breadth
	//area of Circle = 3.14.* r * r
	
	
	  static double areaTriangle() {
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Traingle base: ");
		  int base1 = sc.nextInt();
		  System.out.println("Enter Traingle height: ");
		  int height1 = sc.nextInt();
		  
		 double area = 0.5 * base1 *  height1;
		 return area;
		  
	  }
	  
	  
	  double areaSquare () {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Square side : ");
		  int side1 = sc.nextInt();
		  int area = side1 * side1;
		  return area;
		  
	  }
	  
	  double  areaRectangle() {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter rectangle length : ");
		  int length = sc.nextInt();
		  System.out.println("Enter rectangle breadth: ");
		  int breadth = sc.nextInt();
		   double area =  length * breadth;
		   return area;
	  }
	  
	  double areaCircle() {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter circle radius : ");
		  sc.nextInt();
		  int radius = sc.nextInt();
		  double area  = Math.PI * radius * radius;
		  return area;
	  }
	
}




public class CalculatorzArea {

	public static void main(String[] args) {
		
		
		
		Area a = new Area();
		double triangle = a.areaTriangle();
		double circle = a.areaCircle();
		double square = a.areaSquare();
		double rectangle = a.areaRectangle();
		
		System.out.println("Triangle area : "+ triangle);
		System.out.println("Rectangle area : "+ rectangle);
		System.out.println("Circle area : "+ circle);
		System.out.println("Square area : "+ square);

		
		
		
	}

}
