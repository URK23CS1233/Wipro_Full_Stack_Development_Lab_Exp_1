import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		System.out.println("URK23CS1061");

		Scanner sc = new Scanner(System.in);

		int[] marks = new int[30];
		int[] count = new int[101];

		System.out.println("Enter marks of 30 students:");

		for (int i = 0; i < 30; i++) {
			marks[i] = sc.nextInt();
			count[marks[i]]++;
		}

		for (int i = 0; i <= 100; i++) {
			if (count[i] > 0) {
				System.out.println(i + " = " + count[i] + " student(s)");
			}
		}

		sc.close();
	}
}