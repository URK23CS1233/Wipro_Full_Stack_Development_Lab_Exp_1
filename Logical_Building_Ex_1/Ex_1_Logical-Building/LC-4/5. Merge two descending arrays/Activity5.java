package com.activity;

import java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("URK23CS1061");

		System.out.print("Enter first string: ");
		String str1 = sc.nextLine();

		System.out.print("Enter second string: ");
		String str2 = sc.nextLine();

		String rev = "";

		for(int i = str2.length() - 1; i >= 0; i--) {
			rev = rev + str2.charAt(i);
		}

		String str3 = str1 + rev;

		System.out.println("Result = " + str3);

		sc.close();
	}
}