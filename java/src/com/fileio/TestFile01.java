package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFile01 {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\venky\\Downloads");

//		String[] lis = f.list();
//		int count= 0;
//		
//		for(String f1: lis) {
//			System.out.println(f1);
//			count++;
//		}
//		System.out.println(count);

		File[] f1 = f.listFiles();
		int folderCount = 0;
		int fileCount = 0;
		int miscelCount = 0;

		for (File c : f1) {
			if (c.isDirectory()) {
				folderCount++;
			} else if (c.isFile()) {
				fileCount++;
			} else {
				miscelCount++;

			}
			
		}
		System.out.println("Folders are : "+folderCount);
		System.out.println("Files are : "+fileCount);
		System.out.println("other types are : "+miscelCount);

//		File f = new File("D:\\Java Full Stack Course\\core java\\practice files/edit.txt");
//		boolean isExist = f.exists();
//		System.out.println(f.isDirectory());//checks whether it is folder or not
//		System.out.println(f.isFile());   //checks whether it is file or not
//		
//		System.out.println(f.getFreeSpace());	 //gives free space in that drive
//		System.out.println(f.getTotalSpace());		//actual size
//		System.out.println(f.getUsableSpace()); 		//gives usable space in that drive	
	}
}
