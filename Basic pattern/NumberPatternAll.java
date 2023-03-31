package basicpatternprgrm;

import java.util.Scanner;

public class NumberPatternAll {

	public static int n, i, j, k;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter number row for number pattern :");

		n = sc.nextInt();

//		RightSideTriangleNumberPattern();
//		NumberPatternTwo();
//		NumberPatternThree();
//		NumberPatternFour();
//		NumberPatternFive();
//		NumberPatternSix();
//		NumberPatternSeven();
//		NumberPatternEight();
//		NumberPatternNine();
		NumberPatternTen();

	}

	public static void RightSideTriangleNumberPattern() {

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

		for (i = n; i >= 1; i--) {
			for (j = 1; j <= i - 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}

	public static void NumberPatternTwo() {

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void NumberPatternThree() {

		for (i = 1; i <= n; i++) {
			for (j = n; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void NumberPatternFour() {

		for (i = n; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void NumberPatternFive() {

		for (i = n; i >= 1; i--) {
			for (j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void NumberPatternSix() {

		for (i = n; i >= 1; i--) {
			for (j = n; j >= i; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

	public static void NumberPatternSeven() {

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (j = i - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void NumberPatternEight() {

		for (i = n; i >= 1; i--) {

			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		for (i = 2; i <= n; i++) {

			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

	public static void NumberPatternNine() {

		for (i = 1; i <= n; i++) {

			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (j = i; j <= n; j++) {
				System.out.print(j);
			}

			System.out.println();
		}
		for (i = n - 1; i >= 1; i--) {

			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (j = i; j <= n; j++) {
				System.out.print(j);
			}

			System.out.println();
		}
	}

	public static void NumberPatternTen() {

		for (i = 1; i <= n; i++) {

			for (j = i; j>=1; j--) {
				System.out.print(j+" ");
			}

			System.out.println();
		}
	}

	public static void NumberpatternEleven() {
		
		
	}
}
