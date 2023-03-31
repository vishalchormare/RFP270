package basicpatternprgrm;


import java.util.Scanner;

public class StarPatternDaimandShape {

	public static void main(String[] args) {
		int i,j,k,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter the row of number for pryamid shape : ");
		
		n=sc.nextInt();
		
		 for(i=n;i>=2;i--){
	            for(j=i;j>=1;j--){
	                     System.out.print(" ");
	            }
	            
	           for(k=1;k<=2*(n-i+1)-1;k++){
	                System.out.print("*");
	                
	            }
	        System.out.println("");
	        }
		 
		for(i=n;i>=1;i--) {
			for(j=1;j<=n-i+1;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}	
		}
		
			}


 
