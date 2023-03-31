package basicpatternprgrm;

import java.util.Scanner;

public class PrintAlaphabetStarPatternA {

	public static void main(String[] args) {
		 int i,j,k,n;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the row for Alphabet A : ");
		
//		n=sc.nextInt();
		
		for(i=1; i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i==1||j==1||i==3||j==5) {
					System.out.print("*");	
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
