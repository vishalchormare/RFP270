package basicProgramPattern;

import java.util.Scanner;

public class StarPatternDwonToUp {
	
	public static void main(String[] args) {
		
		 int i,j,n;
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.print("Enter the number of row for half pyramid: ");
		 n=sc.nextInt();
		 
		 for(i=n;i>=1;i--) {
			 for(j=i;j>=1;j--) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		  
	}
}
