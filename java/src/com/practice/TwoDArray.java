package com.practice;

public class TwoDArray {

	    public static void main(String[] args) {

	        int[][] arr = {
	                {1,15},
	                {2,10},
	                {4,8},
	                {20,25}};
	        int n = arr.length;

	        for(int i=0;i<n;i++) {

	            int included = 0;

	            for(int j=0;j<n;j++) {

	                if(i != j) {

	                    if(arr[i][0] >= arr[j][0]
	                            && arr[i][1] <= arr[j][1]) {

	                        included = 1;
	                        break;
	                    }
	                }
	            }

	            System.out.print(included + " ");
	        }
	    }
	}

