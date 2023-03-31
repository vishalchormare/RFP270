package day2basic;

import java.util.Scanner;

public class SwichCaseQestion {

	static int numbermont(int mntnum) {

		switch (mntnum) {
		case 1:
			System.out.println("The month is January");
			break;
		case 2:
			System.out.println("The month is Februar");
			break;
		case 3:
			System.out.println("The month is March");
			break;
		case 4:
			System.out.println("The month is April");
			break;
		case 5:
			System.out.println("The month is May");
			break;
		case 6:
			System.out.println("The month is Jun");
			break;
		case 7:
			System.out.println("The month is July");
			break;
		case 8:
			System.out.println("The month is August");
			break;
		case 9:
			System.out.println("The month is September");
			break;
		case 10:
			System.out.println("The month is October");
			break;
		case 11:
			System.out.println("The month is November");
			break;
		case 12:
			System.out.println("The month is December");
			break;
			default:
				System.out.println("Enter the vaild month number");
		
		}
		return mntnum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String tch;
		System.out.println("Please Enter vowel alphate...:");
		tch = sc.nextLine();
		vowelConstant(tch);
		
		int summnthnumber;
		System.out.println("Please Enter Month of number ...:");
		summnthnumber=sc.nextInt();
		numbermont(summnthnumber);

	}

	static void vowelConstant(String ch) {

	
		switch (ch) {

		case "a":
			System.out.println("a is vowel");
			break;

		case "e":
			System.out.println("e is vowel");
			break;

		case "o":
			System.out.println("o is vowel");
			break;

		case "i":
			System.out.println("i is vowel");
			break;

		case "u":
			System.out.println("u is vowel");

		default:

			System.out.println(ch + " " + "is Consonant");
		}

		System.out.println("********************************************");
	}
}
