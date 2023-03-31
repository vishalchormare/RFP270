 package basicpatternprgrm;

import java.util.Scanner;

public class StarPatternLeftSideTraingle {
	
	public static void main(String[] args) {
		 int i,j,k,n;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Please enter the number of row for Pryamid : ");
		 
		 n=sc.nextInt();
		 
		 
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

