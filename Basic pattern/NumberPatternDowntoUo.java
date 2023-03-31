package basicpatternprgrm;

import java.util.Scanner;

public class NumberPatternDowntoUo {
	public static void main(String[] args) {
		int i,j,n;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Eneter the number of row :" );
		
		n=sc.nextInt();
		
		for(i=n;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
