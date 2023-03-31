package basicProgramPattern;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
	
		int i,j,n;
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter the number of rows for half pyramid:");
		
		n=sc.nextInt();
		for(i=0;i<=n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
