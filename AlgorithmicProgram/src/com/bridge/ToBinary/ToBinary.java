package com.bridge.ToBinary;

import java.util.Scanner;

public class ToBinary {
	public static char[] toBinary(int num) {
		char[] arr = new char[8];
		int i = arr.length - 1;
		while (num != 0) {
			arr[i] = (char) (num % 2);
			num = num / 2;
			i--;
		}
		//System.out.println(num);
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		
		try {
			System.out.print("Enter the number in Decimal :");
			num = sc.nextInt();
			char ar[] = toBinary(num);
		
			 for (int i : ar) { System.out.print(i); } 
			 
		} catch (Exception e) {
			System.err.println("Wrong input");
			System.exit(0);
		}

	}

}
