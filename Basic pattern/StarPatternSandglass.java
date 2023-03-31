package basicpatternprgrm;

import java.util.Scanner;

public class StarPatternSandglass {

	public static void main(String[] args) {
		int i,j,k,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter row of number for Sandglass Pattern : ");
		n=sc.nextInt();
		
		for(i=1;i<=n-1;i++) {
			for(j=i;j>=1;j--) {
				System.out.print(" ");
			}
			for(k=1;k<=2*(n-i+1)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=n;i>=1;i--) {
			for(j=i;j>=1;j--) {
				System.out.print(" ");
			}
			for(k=1;k<=2*(n-i+1)-1;k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
	}
}
