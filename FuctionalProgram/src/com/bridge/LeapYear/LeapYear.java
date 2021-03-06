package com.bridge.LeapYear;
/*
 * @Shubham Bohari
 * PurePose : Program For finding a leap year
 * */
import java.util.Scanner;



public class LeapYear {

	/**Static method for leap year**/
	public static boolean leapYear(int year) {
		
		if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0,count = 0,num = 0;
		boolean result = false,flag = false;
		
		System.out.println(" Enter Yaer : ");
		
		try {
			num = sc.nextInt();
		}catch (Exception e) {
			System.out.println("Input is wrong");
			System.exit(0);
		}
		
		
		    //validation
			year = num;
			while(num != 0) {		
				num = num/10;
				count++;
			}
		
		
			if (count != 4) {
				System.out.println("Enter 4 Digit year");
			}
			else {
				result = leapYear(year);
				
				if (result) {
					System.out.println("Year is Leap Year");
				}
				else {
					System.out.println("Not Leap Year");
				}
			}
		
			
		
		
		
	}//main

}//class
