package com.fileio;
import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterTestDemo01 {
	public static void main(String[] args) throws IOException{
		System.out.println("main method started");
		PrintWriter pw = new PrintWriter("D:\\Java Full Stack Course\\core java\\practice files\\text2.txt");
		pw.println("Hello");
		pw.println("55.5");
		pw.println(9.0);
		pw.println('a');
		pw.println('b');
		pw.flush();
		System.out.println("main Method ended");
		pw.close();
	}

}
