package com.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestStudentDesrializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("D:\\Java Full Stack Course\\core java\\File io practice\\Student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student si = (Student)ois.readObject();	
		System.out.println(si.sno);
		System.out.println(si.branch);
		System.out.println(si.name);
		System.out.println(si.password);
		
		ois.close();
		fis.close();
	}

}
