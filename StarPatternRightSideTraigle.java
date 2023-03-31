package basicProgramPattern;

import java.util.Scanner;

public class StarPatternRightSideTraigle {
	public static void main(String[] args) {
		int i,j,k,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Please enter the number of row for right traingle : ");
		
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=n;i>=1;i--) {
			for(j=1;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		 for(i=1;i<=n;i++) {
			 for(j=1;j<=n-i;j++) {
				 System.out.print(" ");
			 }
			 for(k=1;k<=i;k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		
		for(i=n;i>=1;i--) {
			 for(j=1;j<=n-i;j++) {
				 System.out.print(" ");
			 }
			 for(k=1;k<=i;k++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
		
		}
	}


