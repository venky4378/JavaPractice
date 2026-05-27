package com.arrays;

public class Arrays2dcurly {

	public static void main(String[] args) {
		int count = 0;
		String[][] names = {{"Venky","swamy","dube"},{"gaikwad","krunal","mayanl","patidhar"},{"king","mayank","moon","monlye"}};
		
		for(int i = 0;i<names.length;i++) {
			for(int j = 0;j<names[i].length;j++) {
				System.out.print(names[i][j] + " | " );
				count++;
			}
			System.out.println();
		}
		System.out.println(count);
		System.out.println(names.length);

	}	

}
