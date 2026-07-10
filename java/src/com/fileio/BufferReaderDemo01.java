package com.fileio;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class BufferReaderDemo01 {

	public static void main(String[] args) throws IOException,InterruptedException {
		FileReader fr = new FileReader("D:\\Java Full Stack Course\\core java\\practice files\\new.txt");
		BufferedReader br = new BufferedReader(fr);
		String sr = br.readLine();
		while(sr != null) {
			System.out.println(sr);
			sr = br.readLine();
			Thread.sleep(100);
		}
		
		br.close();
		fr.close();
	}
}
