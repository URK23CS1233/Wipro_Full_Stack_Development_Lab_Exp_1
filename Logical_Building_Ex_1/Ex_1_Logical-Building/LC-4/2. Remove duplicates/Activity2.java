package com.activity;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("URK23CS1061");

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		boolean found = false;
		String result = "";

		for(int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
					ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				result = result + 'z';
				found = true;
			}
			else {
				result = result + ch;
			}
		}

		if(found)
			System.out.println(result);
		else
			System.out.println("No vowels present");
            
		sc.close();
	}
}