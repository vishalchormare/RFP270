package day2basic;

import java.util.Scanner;

public class WhileLoopQuestion {

	public static void main(String[] args) {
		sumofnaturalnumber();
		reversenumber();
	}

	static void sumofnaturalnumber() {
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number");

		int num = sc.nextInt();
		int i = 0;

		while (i <= num) {

			sum = sum + i;

			i++;
		}

		System.out.println("Sum of natual number :" + sum);

		System.out.println("****************************************");

	}

	static void reversenumber() {

		int i=0,revs=0,remider=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number");

		int num = sc.nextInt();
		
		while(num!=0) {
			
			remider=num%10;
			revs=revs*10+remider;
			num=num/10;
			i++;
		
		}
		System.out.println(revs);
	}
}