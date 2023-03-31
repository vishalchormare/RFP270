package basicProgramPattern;

import java.util.Scanner;

public class StarPatternTringle {
	public static void main(String[] args) {
		
		int i=0,temp=0,j,k;
	    Scanner sc= new Scanner(System.in);
	    System.out.print("Enter the number of rows for pyramid: ");  
	    int n= sc.nextInt();  
	    for(i=n;i>=1;i--){
	            for(j=i;j>=1;j--){
	                     System.out.print(" ");
	            }
	           for(k=1;k<=2*(n-i+1)-1;k++){
	                System.out.print("*");
	            }
	        System.out.println("");
	        }
	    
	}

}
