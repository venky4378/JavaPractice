package com.starpatterns;

import java.util.Scanner;

public class Test01 {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
         int q = in.nextInt();

        while(q-- > 0) {
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int sum = a;
        for(int i=0;i<n;i++){
            sum = sum+((1<<i) *b);
            System.out.print(sum + " ");
            
        }System.out.println();
        }
          in.close();  
        }

}
