package rfp270;

//Types of Variables
//3 types => 1>local variables
//         2>instance variables
//         3>static variables

//local variables :- A variable declared within a method or a block is called a local variable
//the scope of the variable remains within that method or block where the variable is declared.
//It is mandatory to initialize local variable
public class VariableTypes {

	static void m1() {
		int x = 10;
		System.out.println(x);
		x = 30;
		System.out.println(x);
	}

	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);

		m1();
		int y;
		System.out.println(y = 10);
		System.out.println(y);

//     int z;
//     System.out.println(z);

	}
}
