package com.gut;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadDataFromFile {
	
	void main() {
		
		int sum = 0;
		int invalidCount = 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:/Java Full Stack Course/core java/read.txt"));
			String line;
			
			while((line = br.readLine()) != null) {

				try {
					int value = Integer.parseInt(line.trim());
					sum += value;
				}
				catch(NumberFormatException e) {
					invalidCount++;
				}
				
			}
			br.close();
		
		}catch(Exception e) {
			System.out.println("File error" +e.getMessage());
		}
		
		System.out.println("Total Sum : "+sum);
		System.out.println("Invalid Count : "+invalidCount);
	}

}
