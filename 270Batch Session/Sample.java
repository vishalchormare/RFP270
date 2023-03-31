package rfp270;

public class Sample {
	public static void main(String[] args) {
		int y=43;
		int res5 = y-- -y++ + y-- - --y + --y - ++y + y++ - y++ + y--;
		System.out.println(y);
		System.out.println(res5);
	}

}
