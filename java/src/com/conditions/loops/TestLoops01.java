package com.conditions.loops;

import java.util.Scanner;

public class TestLoops01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int r = 0;
		int temp = n;
		int sum = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = (sum * 10) + r; 
		}
		

		if (sum == temp) {
			System.out.println("Palindrom " + sum);
		} else {
			System.out.println("Not a Palindrome " + sum);
		}

	}

}

// for Character printing from Z-A and A-Z
//o/p:		Z Y X W V U T S R Q P O N M L K J I H G F E D C B A 
//          A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 

//for(int i = 90;i>=65;i--) {
//	System.out.print((char)i + " ");
//}
//System.out.println();
//for(char j = 65;j<=90;j++) {
//	System.out.print((char)j + " ");
//}
//	
//	
//   Count of Even Numbers and odd count in 100
//	int evenCount = 0;
//	int oddCount = 0;
//	for (int i = 0; i <= 100; i++) {
//		if (i % 2 == 0) {
//			evenCount += 1;
//		} else {
//			oddCount += 1;
//		}
//	}
//	System.out.println("Even count : " + evenCount);
//	System.out.println("Odd Count : " + oddCount);
//
//}

/// from 100 - 0 reverse numbers

//    int i =sc.nextInt();
//	while(i>0) {
//		System.out.print(" "+ i);
//		i--;
//	}	
//}

//{

/// count + sum logic
/// 
/// 
//        int sum = 1;
//        int count = 0;
//
//        for(int i = 1;i<20;i++) {
//// if(i % 2 != 0) {
//        	sum = sum * i;
//        	count += 1;
//            System.out.print(count + "-");
//            System.out.println(sum);
//        
//        }
//// System.out.print(" "+count);
//        sc.close();
//    }
//}