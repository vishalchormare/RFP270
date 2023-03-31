package basicProgramPattern;

import java.util.Scanner;

public class StarPatternTringleDwonToUp {
	
	public static void main(String[] args) {
		int i,j,k,n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter the row for Pramid : ");
		
		n=sc.nextInt();
		
		for(i=n;i>=1;i--) {
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
