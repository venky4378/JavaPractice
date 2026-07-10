package com.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 4750059009180693913L;
	String name = "Marco";
	int sno = 12345;
	transient String password = "venky@437";
	String branch = "Mechanical";
	
	public static void main(String[] args) throws IOException {
		Student s1 = new Student();
		
		FileOutputStream fos = new FileOutputStream("D:\\Java Full Stack Course\\core java\\File io practice\\Student.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		oos.close();
		fos.close();
		
		
		
	}

}
