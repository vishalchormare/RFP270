package basicpatternprgrm;

import java.util.Scanner;

public class StartPatternRightSide {
	
	public static void main(String[] args) {
		int i,j,k,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of row half pryamid: ");
		n=sc.nextInt();

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
