package com.collection;

public class EmployeeModel implements Comparable<EmployeeModel> {

	int id;
	String name;
	double salary;

	public String toString() {
		return "Employee : " + id + " " + name + " " + salary;

	}

	public EmployeeModel(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(EmployeeModel o) {
		if (this.id < o.id) {
			return +1;
		} else if (this.id > o.id) {
			return -1;
		} else {
			return 0;
		}
	}

}
