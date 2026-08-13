package com.collection;

public class EmployeeSort implements Comparable<EmployeeSort>{

	Integer id;
	double salary;
	String name;
	
	public EmployeeSort(int id,String name,double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeSort [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	@Override
	public int compareTo(EmployeeSort o) {
		return this.name.compareTo(o.name);
	}
	
}
