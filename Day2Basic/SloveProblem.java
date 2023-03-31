package day2basic;

import java.util.Scanner;

public class SloveProblem {

	static byte a;
	static short b;
	static int c;
	static long d;
	static float e;
	static double f;
	static boolean g;
	static char h;

	public static void main(String[] args) {
		// Display Message
		display_message();

		// Display primitive data type default value
		primitive_datatype_defaultvalue();

		// Two string are equale or not
		two_string_equal_not();

		// To get the name using the command line
		//getname_using_commanline();
		
		//leap year 
		
		leap_year_or_not_leap_year();
	}

	static void display_message() {
		System.out.println("Display Message");
	}

	static void primitive_datatype_defaultvalue() {

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);

	}

	static void two_string_equal_not() {

		String name1 = "Vishal";
		String name2 = "Vishal";
		String name3 = "Please find name";

		System.out.println(name1.equals(name2));
		System.out.println(name2.equals(name3));
	}

	static void getname_using_commanline() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Name");

		String name = (String) sc.nextLine();

		System.out.println(name);

	}

	static void leap_year_or_not_leap_year() {
		int year;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the year : ");
		year = sc.nextInt();

		if (year >= 1582) {
			
			if((year % 4==0)&&(year % 100 !=0) || (year % 400==0)) {
				
				System.out.println("Specified year is a leap year" + year);
			}else {
		         System.out.println("Specified year is not a leap year"+ year);

			}

		} else {
			System.out.println("Please Enter the vaild year");
		}

	}

	static {
		
	}
	
}
