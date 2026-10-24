import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("URK23CS1061");

		int arr[] = new int[25];

		System.out.println("Enter 25 elements:");

		for (int i = 0; i < 25; i++)
			arr[i] = sc.nextInt();

		int max = arr[0];

		for (int i = 1; i < 25; i++) {
			if (arr[i] > max)
				max = arr[i];
		}

		int first = -1, last = -1;

		for (int i = 0; i < 25; i++) {
			if (arr[i] == max) {
				if (first == -1)
					first = i;

				last = i;
			}
		}

		System.out.println("Maximum Value = " + max);
		System.out.println("First Position = " + first);
		System.out.println("Last Position = " + last);

		sc.close();
	}
}