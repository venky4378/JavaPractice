package com.oops;

public class ObjMethods {
	
	
	
	//Strng toString(String)
	String cname;
	int age;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer Info : [Name = "+cname + ", Age = "+ age;
	}
	
	
	
	
	

	public static void main(String[] args) {

		//OBJ clone();
		//void finalize()
		
		
		//void notify()
		//void notifyAll()
		//void wait()
		// void wait(long ms)
		//void wait(int ms)
		//void wait(long ms,int ms)
		
		
		ObjMethods o1 = new ObjMethods();
		ObjMethods o2 = new ObjMethods();
		
		
		//boolean equals(obj obj)
		System.out.println(o1.equals(o2));
		
		//int hashCode()
		System.out.println(o1.hashCode());
		System.out.println(o1);
		
		
		//obj getClass() ---> fully Qualified name of the class ex:class com.java.TestDemo1
		System.out.println(o1.getClass());
	}

}
