package rfp270;

public class Statements {

	static void m1() {
		System.out.println("m1 starting");
		int d = 78;
		System.out.println(d);
		System.out.println("m1 ending");
	}

	public static void main(String[] args) {
		int x = 20;
		System.out.println(x);
		m1();
		int y = 40;
		System.out.println(y);
		int sum = x + y;
		System.out.println(sum);
	}

}
