package com.java8;

import java.util.function.Consumer;
import java.util.function.Supplier;

//9. Supplier + Consumer
//Supplier should generate
//Employee ID
//EMP1001
//EMP1002
//EMP1003
//Consumer should print
//ID
//Name
//Department

public class EmpSupplier {
	
	String id;
	String name;
	String department;
	
	public EmpSupplier(String id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public static void main(String[] args) {
		
		EmpSupplier emp1 = new EmpSupplier("1001","Emp","QA");
		EmpSupplier emp2 = new EmpSupplier("1002","Emp","QA");
		EmpSupplier emp3 = new EmpSupplier("1003","Emp","QA");
		 
		EmpSupplier [] amp = {emp1,emp2,emp3};
		
		final int[] count = {100};
		
		Supplier<String> e1 = () ->"Supplier" + count[0]++;
	
		Consumer<EmpSupplier> e2 = (s2)->{
			System.out.println(s2.department);
			System.out.println(s2.id);
			System.out.println(s2.name);
		};
		
		for(EmpSupplier e3:amp) {
			System.out.println( e1.get());
			e2.accept(e3);
			System.out.println("-----------------------");
		}	
}
	}
		


