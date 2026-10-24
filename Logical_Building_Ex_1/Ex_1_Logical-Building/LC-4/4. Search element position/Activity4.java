package com.activity;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("URK23CS1061");

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		char[] ch = str.toCharArray();

		for(int i = 0; i < ch.length; i++) {

			int count = 1;

			if(ch[i] == ' ')
				continue;

			for(int j = i + 1; j < ch.length; j++) {

				if(ch[i] == ch[j]) {
					count++;
					ch[j] = ' ';
				}
			}
			System.out.println(ch[i] + " = " + count);
		}

		sc.close();
	}
}