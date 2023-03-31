package doubtsession;

import java.util.Scanner;

public class BasicQestion {

	static int addtion(int x, int y) {
		int sum = x + y;
		return sum;
	}

	static void multipication() {
		int x = 10;
		int y = 10;
		int z;
		z = x * y;
		System.out.println(z);
	}

	static void subtraction(int x, int y) {
		int z = x * y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		int result = addtion(8, 6);

		int y = 43;

		System.out.println(result);

		multipication();

		subtraction(5, 8);

		filternumber();

		palindrome_number_or_not();

	}

	static void filternumber() {

		int[] evennumber = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20 };
		int sum = 0;
		for (int i = 0; i < evennumber.length; i++) {
			if (evennumber[i] % 2 == 0) {

				sum = sum + evennumber[i];
				// result1(evennumber[i]);
			}
		}
		System.out.println(sum);

	}

	static void result1(int sum) {
		System.out.println(sum);
	}

	static void palindrome_number_or_not() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");

		String reverse = "";

		String num = sc.nextLine();

		int length = num.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + num.charAt(i);
		if (num.equals(reverse))
			System.out.println(num + " is a palindrome.");
		else
			System.out.println(num + "  isn't a palindrome.");

	}
}
