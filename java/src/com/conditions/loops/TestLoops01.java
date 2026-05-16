package com.conditions.loops;

import java.util.Scanner;

public class TestLoops01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 90;i>=65;i--) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		for(char j = 65;j<=90;j++) {
			System.out.print((char)j + " ");
		}
		
}

}
	
	
	
	
	
	
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