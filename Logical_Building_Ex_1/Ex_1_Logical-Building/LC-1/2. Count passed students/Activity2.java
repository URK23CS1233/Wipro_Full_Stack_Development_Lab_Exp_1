package com.activity;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		System.out.println("URK23CS1061");
		
		for (int i = 1; i <= 3; i++) {
			
			System.out.print("Enter mark of student " + i + ": ");
			int mark = sc.nextInt();
			
			if (mark >= 35) {
				count++;
			}
		}
		
		System.out.println("Students Passed = " + count);
		
		sc.close();
	}
}