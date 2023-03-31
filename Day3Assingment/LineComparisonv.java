package day3basic;

import java.util.Scanner;

public class LineComparisonv {
	double lenghtasTwopoint(int x1, int y1, int x2, int y2) {

		double len1 = (double) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		return len1;
	}

	double lenghtasTwopointequale(int p1, int q1, int p2, int q2) {

		double len2 = (double) Math.sqrt((p1 - p2) * (p1 - p2) + (q1 - q2) * (q1 - q2));

		return len2;
	}

	public static void main(String[] args) {

		LineComparisonv linecomparisonv = new LineComparisonv();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value for x1 and y1 ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		System.out.println("Enter the value for x2 and y2 ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		System.out.println("Enter the value for p1 and q1 ");
		int p1 = sc.nextInt();
		int q1 = sc.nextInt();

		System.out.println("Enter the value for p2 and q2 ");
		int p2 = sc.nextInt();
		int q2 = sc.nextInt();

		double len1 = linecomparisonv.lenghtasTwopoint(x1, y1, x2, y2);
		System.out.println("Line1 = " + len1);

		double len2 = linecomparisonv.lenghtasTwopointequale(p1, q1, p2, q2);
		System.out.println("Line2 = " + len2);

		if (len1 == len2) {
			System.out.println("Both are equale");
		} else {
			System.out.println("Both are not equale");
		}

		if (len1 > len2) {
			System.out.println("Line1 is greater than Line2");
		} else {
			System.out.println("Line2 is greater than Line1");
		}

	}

}
