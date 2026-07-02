package com.strings;

public class TestDemo01 {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();

		System.out.println("Initinal Heap :" + rt.totalMemory() / (1024 * 1024) + "MB");
		System.out.println("MAx heap:  " + rt.maxMemory() / (1024 * 1024) + "MB");
		System.out.println("Free space : " + rt.freeMemory() / (1024 * 1024) + "MB");	
		
		
		

	}
}