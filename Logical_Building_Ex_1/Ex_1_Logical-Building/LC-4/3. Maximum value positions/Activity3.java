package com.activity;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("URK23CS1061");

		System.out.print("Enter first string: ");
		String str1 = sc.nextLine();

		System.out.print("Enter second string: ");
		String str2 = sc.nextLine();

		String str3 = str1 + " " +str2;

		System.out.println("Concatenated String = " + str3);

		sc.close();
	}
}