package com.strings;

public class LongestPrefix02 {
	
	
	public static void main(String[] a) {
		String[] str = {"flower","flow","flight"};
		
		String result = "";
		
		for(int i = 0;i<str[0].length();i++) {
			char ch = str[i].charAt(i);
			boolean match = true;
			
			for(int j = 1;j<str.length;j++) {
				if( i == str[j].length() || ch != str[j].charAt(i) ) {
					match = false;
					break;
				}
				
			}
			if(match) {
				result += ch;
			}else {
				break;
			}
			
		}
		System.out.println(result);
	}
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static void main(String[] a) {
//		String[] str = { "flower", "flow", "flight" };
//		String result = "";
//		for (int i = 0; i < str[0].length(); i++) {
//
//			char ch = str[0].charAt(i);
//
//			boolean match = true;
//
//			for (int j = 1; j < str.length; j++) {
//
//				if (i == str[j].length() || ch != str[j].charAt(i)) {
//					match = false;
//					break;
//				}
//
//			}
//
//			if (match) {
//				result += ch;
//			} else {
//				break;
//			}
//		}
//		System.out.println(result);
//	}

}
