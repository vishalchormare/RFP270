package day2basic;

import java.util.Scanner;

public class ForLoopQestion {

	public static void main(String[] args) {

		sum_of_natural_number();

		revers_number();

		Palindrome();

	}

	static void sum_of_natural_number() {

		int num, sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the number");

		num = sc.nextInt();

		for (int i = 0; i <= num; i++) {

			sum = sum + i;
		}
		System.out.println("Sum of natural number is : " + sum);

		System.out.println("**************************************************");
	}

	static void revers_number() {

		int num, revs = 0, remndir = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number");
		num = sc.nextInt();

		for (int i = 1; num!=0; i++) {
				remndir = num % 10;
				revs = revs * 10 + remndir;
				num = num / 10;
			
		}
		System.out.println("Revers Number is " + revs);

		System.out.println("*****************************");

	}

	static void Palindrome() {
		int num, revs = 0, remndir = 0, temp = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the number");

		num = sc.nextInt();
		
		temp=num;

		for (;temp != 0;) {
			remndir = temp % 10;
			revs = revs * 10 + remndir;
			temp = temp / 10;
		}
		if (num == revs) {
			System.out.println(num + " is a palindrome number.");
		} else {
			System.out.println(num + " is not a  palindrome number.");
		}

	}
}
