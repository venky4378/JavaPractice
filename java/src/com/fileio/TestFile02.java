package com.fileio;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFile02 {
	public static void main(String[] args) throws FileNotFoundException,IOException,InterruptedException {
		FileReader f = new FileReader("D:\\Java Full Stack Course\\core java\\practice files\\new.txt");
		int r = f.read();
		while(r != -1) {
			System.out.print((char)r);
			r = f.read();
			Thread.sleep(100);
		}
		
		f.close();
	}

}
