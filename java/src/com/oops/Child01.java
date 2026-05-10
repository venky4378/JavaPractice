package com.oops;

public class Child01 extends Parent01 {
	
//	By using child class object reference we are calling the child class overrided methods.	
	@Override
	String setName(int id) {
		String name = "Mahesh";
		return name;
	}
	@Override
	int setSid() {
		int id = 546;
		return id;
	}
	double salary() {
		return 50000.00;
	}
	
	@Override              ///here we are Overriding the parent class methods with same method signature
							// but here it is object data type so here Long is the sub type of Number
	Long phone() {
		Long number = 987654345678L;
		return number;
	}

	public static void main(String[] args) {
		
		//Child class reference ---- child class object  = we can call both the methods of child class and also parent class methods.
		Child01  c1 = new Child01();
//		System.out.println(c1.setName());
		System.out.println(c1.setSid());
		//child class method
		System.out.println(c1.salary());
		//Parent class method
		System.out.println(c1.cutting());
		
		//
		Parent01 p1 = new Parent01();
		System.out.println(p1.cutting()); ///parent class methods only we can call by using the parent class reference and parent object
//		System.out.println(p1.salary());   ---CE-(The method salary() is undefined for the type Parent01)
		
		Parent01 s1 = new Child01();
//		System.out.println(s1.setName());
		System.out.println(s1.setSid());
		
		
//Scenario -3 :   we are creating the parent class reference we are storing the child class object it is also called as dynamic polymorphism 
//					whenever we are calling the same method signatures of parent class :
//					Before java 1.4 methods and return type must be same but after java 1.5 return type is different like it 
//					For primtive data type the return type must be same primitve only and for object data type iyt will accept co-varient return types 
//				1.For primitive --primitive only
//				2.For object data type : 
//					Number type : subtypes --->Integer,Double,Long,Short,Byte like that....
//					Obj type : subtypes ---->String,String Buffer,Employee,or any......
//					String : sub types----> there is no subtype of string type.... for string string only return type

	}
//	Scenario --4 : 
//				Child01 c2 = new Parent01();
				
//				its not posssible beacuse parent class is not extending the child class but parent class extending nly object not child class so it gives the compile time error.

}
