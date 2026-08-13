package com.java8;

import java.util.function.Function;
import java.util.function.Predicate;


public class Employees {
	String name;
	Integer age;
	Double salary;
	String department;
	
	public Employees(String name,Integer age,Double salary,String department) {
		this.name = name;
		this.age = age;
		this.salary  = salary;
		this.department = department;
	}
	
	
	
	
	public static void main(String[] args) {
		Employees e1 = new Employees("Sai",21,5000.00,"Mech");
		Employees e2 = new Employees("Lusi",32,60000.0,"Civil");
		Employees e3 = new Employees("Marco",44,55000.0,"ECE");
		Employees e4 = new Employees("Raj",55,70000.0,"DME");
		
		
		Employees[]  s2 = {e1,e2,e3,e4};
		
		Function<Employees,String> p2 = (p) ->{
			String role ="";
			
			if(p.salary > 50000) {
				role = "manager";
			}else if(p.salary <50000) {
				role = "Trainee";
			}
			
			return role;
			
		};
		Predicate<Double> p1 = s -> s > 50000.0 || s<50000;
		
		for(Employees s1 : s2) {
			if(p1.test(s1.salary)) {
				System.out.println("Name of Employee : "+ s1.name);
				System.out.println("Salary of the Employee : "+ s1.salary);
				System.out.println("Role : "+ p2.apply(s1));
				System.out.println("Age of the employee : "+ s1.age);
				System.out.println("Department of the empoyee : "+ s1.department);
				System.out.println("--------------------------------------");
			}
			
		}
	}

}
