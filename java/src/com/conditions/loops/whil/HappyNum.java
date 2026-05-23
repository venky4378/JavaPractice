package com.conditions.loops.whil;

//Happy Number : if the given value is 9 then we have to 9^2 = 81 and then 
// 8^2 + 1^2 = 64 + 1 = 65 and then again checks 6^2 + 5 ^2 = 36 + 25 = 61
//until it becomes n = 1
import java.util.Scanner;

public class HappyNum {

	static boolean isHappy(int n) {
		boolean status = false;
		int temp = n;
		int r = 0;
		while (temp != 1 && temp != 4) {
			int sum = 0;
			while (temp > 0) {
				r = temp % 10;
				sum = sum + (int) (Math.pow(r, 2));
				temp = temp / 10;
			}
			temp = sum;

			System.out.println(sum);
			if (sum == 1) {
				status = true;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int n = sc.nextInt();
		boolean flag = isHappy(n);
		if (flag) {
			System.out.println("happy num");
		} else {
			System.out.println("Not Happy");

		}

	}

}
