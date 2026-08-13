package com.gut;

public class PatternMatch {
	
	
	public static void main(String[] args) {

	        String text = "AABAACAADAABAABA";
	        String pattern = "AABA";
	        for (int i = 0; i <= text.length() - pattern.length(); i++) {
	            int j;
	            for (j = 0; j < pattern.length(); j++) {

	                if (text.charAt(i + j) != pattern.charAt(j)) {
	                    break;
	                }
	            }
	            if (j == pattern.length()) {
	                System.out.println(i);
	            }
	        }
	    }
	
}


