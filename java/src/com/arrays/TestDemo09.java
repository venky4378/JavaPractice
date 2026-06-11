package com.arrays;
		
//"Find frequency of all elements in an array"

public class TestDemo09{
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,10,30,20,40,10};
		
		boolean[] visited = new boolean[arr.length];
		
		for(int i = 0;i<arr.length;i++) {
			if(visited[i]) {
				continue;
			}
			
			int count = 1;
			
			for(int j = i + 1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					visited[i] = true;
				}
			}
			
			System.out.println(arr[i] + " "+ count);
		}
		
		
		
	
	}
}
	