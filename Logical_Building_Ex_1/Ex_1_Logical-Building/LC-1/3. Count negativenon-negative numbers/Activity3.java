package com.activity;
import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int negative = 0;
		int nonNegative = 0;

		for (int i = 1; i <= 5; i++) {
			
			System.out.print("Enter number " + i + ": ");
			int num = sc.nextInt();

			if (num < 0) {
				negative++;
			} else {
				nonNegative++;
			}
		}
		System.out.println("URK23CS1061");

		System.out.println("Negative Numbers = " + negative);
		System.out.println("Non-Negative Numbers = " + nonNegative);
	}
}