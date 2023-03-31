package rfp270;

public class Selection {

	public static void main(String[] args) {

		int x = 18;

		if (x == 19) {
			System.out.println("x == 19");
		}

		if (x >= 20) {
			System.out.println("x is >= 20");
			System.out.println("abc");
		} else {
			System.out.println("bcd");
			System.out.println("x is < 20");
		}

		int a = 34;
		int b = 39;
		//
		if (a > 34 && b > 40) {
			System.out.println("a > 34 and b > 40");
		} else if (a > 34 && b <= 40) {
			System.out.println("a>34 and b<=40");
		} else if (a <= 34 && b <= 40) {
			System.out.println("a <= 34 and b<=40");
		} else {
			System.out.println("this is else");
		}

		System.out.println("main ending");

		int d = 1;
		switch (d) {
		case 1:
			int z = 10;
			int y = 40;
			int sum = z + y;
			System.out.println(sum);
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break;
		case 4:
			System.out.println("case 4");
			break;
		default:
			System.out.println("default");
		}

		char ch = 'A';

		switch (ch) {

		case 'A':
			System.out.println("case A");
			break;
		case 'B':
			System.out.println("case B");
			break;
		case 'C':
			System.out.println("case C");
			break;
		default:
			System.out.println("default");
		}

	}

}
