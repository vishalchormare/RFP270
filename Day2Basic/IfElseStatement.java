package day2basic;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {

	//	digitNumber_writeword();
		
		unitnumber();

	}

	static void digitNumber_writeword() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the Single Digit Number :");

		int num = sc.nextInt();

		if (num == 0) {
			System.out.println("ZERO");
		} else if (num == 1) {
			System.out.println("ONE");
		} else if (num == 2) {
			System.out.println("TWO");
		} else if (num == 3) {
			System.out.println("THREE");
		} else if (num == 4) {
			System.out.println("FOUR");
		} else if (num == 5) {
			System.out.println("FIVE");
		} else if (num == 6) {
			System.out.println("SIX");
		} else if (num == 7) {
			System.out.println("SEVEN");
		} else if (num == 8) {
			System.out.println("EIGHT");
		} else if (num == 9) {
			System.out.println("NINE");
		} else {
			System.out.println("Please Enter the Single Digit");
		}

	}

	static void unitnumber() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter the number");
		int num=sc.nextInt();
		if(num<10) {
			System.out.println("unit digit number ");
	
		}else if(num<100) {
			System.out.println("ten digit number");
			
		}else if (num<1000) {
			System.out.println("hunder digit number");
		}else {
			System.out.println("thounsand digit number");
		}
		sc.close();
	}
}
