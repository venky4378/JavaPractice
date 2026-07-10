package com.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestDemo03 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("main");
		FileReader fr =  null;
		try {
			fr = new FileReader("D:\\Java Full Stack Course\\core java\\File io practice\\student.txt");
			int e = fr.read();
			while (e != -1) {
				Thread.sleep(100);
				System.out.print((char) e);
				e = fr.read();
			}
		} catch (Exception e) {
			System.out.println("error handled");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally");
			if(fr!=null) {
				fr.close();
			}

		}

	}

}
