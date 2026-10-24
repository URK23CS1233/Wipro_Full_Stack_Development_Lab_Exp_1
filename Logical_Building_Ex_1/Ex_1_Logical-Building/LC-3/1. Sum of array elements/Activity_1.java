package com.activity;
import java.util.*;

public class Activity_1 {

	public static void main(String[] args) {

		System.out.println("URK23CS1061");
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int sum = 0;

		System.out.println("Enter 10 numbers:");

		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}

		System.out.println("Sum = " + sum);

		sc.close();
	}
}