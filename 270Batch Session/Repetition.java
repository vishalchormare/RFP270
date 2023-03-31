package rfp270;

public class Repetition {

	public static void main(String[] args) {
		int i = 2;
		System.out.println(i); // 2
		int res1 = ++i;
		System.out.println(i); // 3
		System.out.println(res1); // 3

		int j = 2;
		System.out.println(j); // 2
		int res2 = j++;
		System.out.println(j); // 3
		System.out.println(j);
		System.out.println(res2); // 2

		int k = 2;
		System.out.println(k); // 2
		int res3 = k++;
		System.out.println(k++); // 3
		System.out.println(k); // 4
		System.out.println(k); // 4
		System.out.println(res3); // 2

		int x = 10;
		int res4 = x++ + ++x + x++ + x++ + ++x + ++x + x++;
		// 10 + 12 + 12 + 13 + 15 + 16 + 16 = 94
		System.out.println(x); // 13 // 17 // 13 // 13 // 13 // 13 // 17
		System.out.println(res4); // 81 // 94 // 73 // 89 // 63 // 83

		int y = 43;
		int res5 = y-- - y++ + y-- - --y + --y - ++y + y++ - y++ + y--;
		// 43 - 42 + 43 - 41 + 40 - 41 + 41 - 42 + 43 = 44
		System.out.println(y); // 42 // 43 // 42 // 42 // 44 // 43 // 43 // 42 // 40 // 43 // 42
		System.out.println(res5); // 94 // 44 // 44 // 44 // 44 // 41 // 43 // 44 // 41 // 44 // 44

		// for(initialization; condition-check; increment/decrement)

		for (int l = 0; l < 10; l++) {
			System.out.println(l);
		}
		System.out.println();

		int m = 0;
		while (m < 10) {
			System.out.println(m);
			m++;
		}
		System.out.println();

		int n = 0;
		do {
			System.out.println(n);
			n++;
		} while (n <= 10);
	}

}
