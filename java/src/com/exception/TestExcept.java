package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Extracting the file data from the given file at the class path by using class path the file reader reads that 
// and read it into the console.

public class TestExcept {

	public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException {

		File file = new File("C:\\Users\\venky\\OneDrive\\Desktop\\acer\\Swamy\\text.txt");
		boolean status = file.createNewFile();
		FileReader fr = new FileReader(file);

		int n = fr.read();
		while (n != -1) {
			System.out.print((char) n);
			n = fr.read();
			Thread.sleep(100);


		}fr.close();

//		if (status) {
//			System.out.println("File created");
//		} else {
//			System.out.println("File not created");
//		}
	}
}
