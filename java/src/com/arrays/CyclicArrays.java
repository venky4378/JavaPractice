package com.arrays;

import java.util.Arrays;

public class CyclicArrays {
	
	   public static int[] nextGreater(int[] nums) {

	        int n = nums.length;
	        int[] result = new int[n];
	        for(int i = 0;i<n;i++) {
	        		result[i] = -1;
	        } 
	        for (int i = 0; i < n; i++) {
	            for (int j = 1; j < n; j++) {
	                int next = (i + j) % n;
	                if (nums[next] > nums[i]) {
	                    result[i] = nums[next];
	                    break;
	                }
	            }
	        }

	        return result;
	    }

	public static void main(String[] args) {

		        int[] nums = {1, 2, 1};

		        System.out.println(Arrays.toString(nextGreater(nums)));
		    }
		}


