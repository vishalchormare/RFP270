package rfp270;

public class PatterQuestion {

	public static int i, j,l;

	public static void main(String[] args) {

//		PatternOne();
//		PatternTwo();
//		PatternThree();
//		PatternFour();
		PatternFourLogicTwo();
	}

	public static void PatternOne() {

		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (i = 4; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void PatternTwo() {

		System.out.println("");
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void PatternThree() {
		System.out.println("");
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void PatternFour() {


		System.out.println("");

		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 10; j++) {
				if ((i == 1 & j > 9) || (i == 2 & j > 8) || (i == 3 & j > 7) || (i == 4 & j > 6) || (i == 5 & j > 5)
						|| (i == 6 & j > 6) || (i == 7 & j > 7) || (i == 8 & j > 8) || (i == 9 & j > 9)) {
					System.out.print("* ");
				} else {
					System.out.print(" ");

				}
			}

			System.out.println();
		}

	}

	public static void PatternFourLogicTwo() {

		System.out.println("");

		for (i =-5; i <= 5; i++) {
			if(i<0) {
				 l=-i;
			}else {
				 l=i;
			}

			for(j=0;j<l;j++) {
				System.out.print(" ");
			}
			for(j=0;j<5-l+1;j++) {
				System.out.print("* ");
			}
				System.out.println();
		}

	}
}