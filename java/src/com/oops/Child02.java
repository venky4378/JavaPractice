package com.oops;

public class Child02 extends Parent02{
	@Override
	private double salaryEmp() {
		return 800000.00;
	}

	public static void main(String[] args) {

		
//		Method Overriding : if the child class is not satisfy with the parent class functionalities or not happy 
//		then the child class override the parent class functionalities according to their requirement.is called method Overriding.
//		Rules of Method Overriding :  8 rules
//Rule-1: method signature must be same
//		note : method signature is (same name + arguments)  but different return type 
//Rule-2: method return type must be same until 1.4 after 1.5 method return type can be its covarient return types or same return types. 
//		note:primitive data --->same primitive return type only
//				for obj type---->covarient or its subtype or same type
//		1.For primitive --primitive only
//		2.For object data type : 
//			Number type : subtypes --->Integer,Double,Long,Short,Byte like that....
//			Obj type : subtypes ---->String,String Buffer,Employee,or any......
//			String : sub types----> there is no sub type of string type.... for string string only return type
//	Rule-3: The scope of method Overriding should not be reduced.
//			Note : private < (<default>) < protected < public
//				--> if the methood is public we can must provide the child class as public only
//				--> if the method is protected we can provide protected or public or child class
//				--> if the method is default we can provide default or protected or public
//				-->if the method is private then we can override the private methods in other classes because the scope of private is within the class only

		
		Parent02 p1 = new Child02();
		p1.salaryEmp();
		
		
	}

}
