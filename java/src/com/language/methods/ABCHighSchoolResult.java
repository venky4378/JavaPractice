package com.language.methods;

// 	A school named ABC High School wants to automate student result calculation. Each student appears for 5 subjects : 
//	Mathematics,Science,English,Social,Telugu.
//	The System should:
// Take marks of all 5 subjects as input
// Calculate total marks
// Calculate percentage
// Return the percentage





import java.util.Scanner;




class Student{
	 int getTotalMarks(int a,int b,int c,int d,int e) {
		 int totalMarks = a + b + c + d + e;
		 return totalMarks;
	 }
	 double getPercentage(double f) {
		 double percentage = (f/500) * 100;
		 return percentage;
		 
	 }
 }

public class ABCHighSchoolResult {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mathematics marks : ");
		int mathematics = sc.nextInt();
		System.out.println("Enter the science marks : ");
		int science = sc.nextInt();
		System.out.println("Enter the science marks : ");
		int english = sc.nextInt();
		System.out.println("Enter the english marks : ");
		int social = sc.nextInt();
		System.out.println("Enter the telugu marks : ");
		int telugu = sc.nextInt();
		
		Student s = new Student();
		
		int f = s.getTotalMarks(mathematics,science,english,social,telugu);
		double percentage = s.getPercentage(f);		
		
		System.out.println("Percentage : " + percentage); 
				
	}

}
