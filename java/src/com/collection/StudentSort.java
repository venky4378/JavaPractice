package com.collection;

public class StudentSort implements Comparable<StudentSort> {

	int sid;
	String sname;
	int age;
	double salary;

	public StudentSort(int sid, String sname, int age, double salary) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.salary = salary;
	}

	public String toString() {
		return "Student Details : [ " + sid +" " +  sname +" "+ age +" "+ salary + " ]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(StudentSort o) {

		//For Integrs like id or any numeric like Integers data  //descendin
//		if (this.sid < o.sid) {
//			return 1;
//		} else if (this.sid > o.sid) {
//			return -1;
//		} else {
//
//			return 0;
//		}
		
		//For String type
		return this.sname.compareTo(o.sname);
		
		
//		return -this.sname.compareTo(o.sname);   //for descending order

	}

}
