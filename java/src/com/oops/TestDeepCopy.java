package com.oops;

class Student{
	int sid;
	String sname;
	Address01 add1;
	
	public Student(int sid,String sname,Address01 add1) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.add1 = add1;
		
	}
	Student(Student student){
		this.sid = student.sid;
		this.sname = student.sname;
		this.add1 = new Address01(student.add1);
	}
	
	
}


class Address01{
	String city;
	public Address01(String city){
		this.city = city;
		
		
	}
	public Address01(Address01 add1) {
		this.city = add1.city;
	}
}

public class TestDeepCopy {

	public static void main(String[] args) {
		
		Address01 address = new Address01("Hyderabad");
		Student s1 = new Student(101,"Venky",address);
		
		System.out.println("Id : "+s1.sid);
		System.out.println("Name : "+s1.sname);
		System.out.println("Address : "+s1.add1.city);
		System.out.println("---------------------------------");
		
		Student s2 = new Student(s1);
		s2.add1.city = "Banglore";
		System.out.println("Address : "+ s1.add1.city);
		System.out.println("Address : "+s2.add1.city);

		
	}

}
