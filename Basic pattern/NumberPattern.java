package basicpatternprgrm;

import java.util.Scanner;

public class NumberPattern {
	
	public static void main(String[] args) {
		int i,n,j;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Please Enter the number of row :");
		
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
}
