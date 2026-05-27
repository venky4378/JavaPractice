package com.arrays;

public class DuplicateStrings {
    public static void main(String[] args) {

        String[] arr = {"java", "python", "java", "c", "python"};

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }

            if (count > 1) {

                boolean alreadyPrinted = false;

                for (int k = 0; k < i; k++) {

                    if (arr[i].equals(arr[k])) {
                        alreadyPrinted = true;
                        break;
                    }
                }

                if (!alreadyPrinted) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}








































////Duplicate Strings in an array
//public class DuplicateStrings {
//
//	public static void main(String[] args) {
//		String duplicateValue = " ";
//		int count = 0;
//
//		String[] names = { "Mango", "Orange","Apple", "Apple", "Cocunut", "Mango", "Mango", "Grapes", "Mango" };
//
//		for (int i = 0; i < names.length; i++) {
//			for (int j = i + 1; j < names.length; j++) {
//				if (names[i].equals(names[j])) {
//					count++;
//					duplicateValue = names[i];
//					break;
//				}
//
//			}
//			
//		}
//		System.out.println(count);
//		System.out.println(duplicateValue);
//	}
//
//}
