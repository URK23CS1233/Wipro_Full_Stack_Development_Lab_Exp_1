package com.activity;

import java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {
		System.out.println("URK23CS1061");
		Scanner sc = new Scanner(System.in);

		int[] range = new int[10];

		System.out.println("Enter marks of 30 students:");

		for (int i = 0; i < 30; i++) {

			int mark = sc.nextInt();

			if (mark <= 10)
				range[0]++;
			else if (mark <= 20)
				range[1]++;
			else if (mark <= 30)
				range[2]++;
			else if (mark <= 40)
				range[3]++;
			else if (mark <= 50)
				range[4]++;
			else if (mark <= 60)
				range[5]++;
			else if (mark <= 70)
				range[6]++;
			else if (mark <= 80)
				range[7]++;
			else if (mark <= 90)
				range[8]++;
		}
	}
}