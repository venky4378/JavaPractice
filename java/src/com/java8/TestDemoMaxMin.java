package com.java8;

//6.Write a lambda expression to find the maximum of two numbers.



interface In2{
	void findMax(int m,int n);
}
//class Impl1 implements In2{
//	
//	public void findMax(int m,int n) {
//		if(m>n) {
//			System.out.println("Largest :" + m);
//		}else {
//			System.out.println("Second : "+ n);
//		}
//	}
//	
//}

public class TestDemoMaxMin {
	public static void main(String[] args) {
		
		In2 i = (a,b) -> {
			
			if(a>b) {
				System.out.println( a + " is greater");
			}else {
				System.out.println( b + " is greater");
			}
		};
		i.findMax(99, 76);
		
		
			
	}

}
