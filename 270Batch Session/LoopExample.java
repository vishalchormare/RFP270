package rfp270;

import java.util.Random;
import java.util.Scanner;

public class LoopExample {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		primeNumber();

		reversElementofArray(new int[] { 1, 2, 3, 4, 5 });
		sumofelementofArray(new int[] { 1, 2, 3, 4, 5 });
		factorialNumber(6);
		palindrome_number_or_not();
		random();
	}

	static void primeNumber() {

		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int i;

		int isPrime;

		for (i = 1; i < arr.length; i++) {

			isPrime = 1;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = 0;
					break;
				}
			}

			if (isPrime == 1) {

				System.out.println(i + "This is prime number");
			}

		}

	}

	static int reversElementofArray(int[] arr) {

		int i, j, temp = 0;

		for (i = arr.length - 1; i >= 0; i--) {

			System.out.println("Revers Element of array" + " " + arr[i]);

		}

		return 0;
	}

	static int sumofelementofArray(int[] arr) {
		int i, sum = 0;
		for (i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		return 0;
	}

	static int factorialNumber(int num) {

		int i, fac = 1;

		for (i = 1; i < num; i++) {
			fac = fac * i;
		}
		System.out.println(fac);
		return num;
	}

	static void palindrome_number_or_not() {

		int num = 12021, reverse = 0, rem, temp = 0;

		while (temp != 0) {
			rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp /= 10;
		}
		if (num == reverse) {
			System.out.println(num + " is Palindrome");

		} else {
			System.out.println(num + " is Not Palindrome");
		}
	}

	static void random() {

		int a = (int) (Math.random() * 10) % 5;

		System.out.println(a);

		int min=200;
		int max=400;
		
		int b  = (int)(Math.random()*(max-min+1)+min);
		System.out.println(b);

	}

	static void swtichcase() {
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
			default:
				System.out.println("Please enter vaild Number");
		}
	}
}
