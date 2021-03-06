package com.bridge.Hash;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HashDemo {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/home/admin3/Shubham/int.txt");
		Scanner scr = new Scanner(file);
		int ar[] = new int[10];
		int num  = 0;
		Hashing hash = new Hashing();
		Scanner sc = new Scanner(System.in);
		String[] str = scr.nextLine().split(" ");
		try {
			for (int i = 0; i < str.length; i++) {
				ar[i] = Integer.parseInt(str[i]);
			}
			for (int i = 0; i < str.length; i++) {
				hash.addHash(ar[i]);
			}
			hash.showHash();
			System.out.print("Enter a number :");
			num = sc.nextInt();
			if(hash.search(num)) {
				hash.remove(num);
			}
			else {
				hash.addHash(num);
			}
			hash.showHash();
		} catch (Exception e) {
			System.err.println("Wrong Input");
			e.printStackTrace();
			System.exit(0);
		}
	}
}
