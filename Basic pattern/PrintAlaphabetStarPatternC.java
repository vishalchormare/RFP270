package basicpatternprgrm;

public class PrintAlaphabetStarPatternC {
	 
	public static int i,j, k=1;
	
	public static void main(String[] args) {

		PatternC();
		PatternD();
		PatternE();
		PatternF();
		PatternG();
		PatternH();
		PatternI();
	    PatternJ();
		PatternK();
		PatternL();
		PatternM();
		PatternN();
		PatternO();
		PatternP();
		PatternQ();
		PatternR();
		PatternS();
		PatternT();
		PatternU();
		PatternW();
		PatternX();
		PatternY();
		PatternZ();
	}
	public static void PatternC() {

		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i==1||i==5||j==1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

	public static  void PatternD() {

		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(j==1||(i==1&j<=4)||(i==5&j<=4)|| (i>=2&i<=4)&j==5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

	public static  void PatternE() {
		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(j==1|| i==1||i==5 ||(i==3&j<=4)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

	public static  void PatternF() {
		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(j==1|| i==1 || i==3&j<=3) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

	public static  void PatternG() {

		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if((i==1)||j==1||i==5||(i==3&j>2)||( i==4 & j>4)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

	public static  void PatternH() {


		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if((i==1&j<1)||j==1||j==5||(i==3)){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

   }

	public static  void PatternI() {


		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if((i==1&j<=4)||(i==5&j<=4)||j==2){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

   }

	public static  void PatternJ() {


		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i==1||j==4||(i==5&j<=4)||(j==1&i>=4)){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

   }

	public static  void PatternK() {

		System.out.println(" ");
		for(i=1;i<=6;i++) {
			for(j=1;j<=6;j++) {
				if(j==1||(i==3&j<=2)||(i==2&j<=3&j>2)||(i==1&j<=4&j>3)||(i==4&j<=2||i==5&j<=3&j>2||(i==6&j<=4&j>3))){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

   }

	public static  void PatternL() {

		System.out.println(" ");
		for(i=1;i<=6;i++) {
			for(j=1;j<=6;j++) {
				if(j==1||i==6){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

   }

	public static  void PatternM() {


		System.out.println(" ");
		for(i=1;i<=6;i++) {
			for(j=1;j<=6;j++) {
				if(j==1||j==6||(i==2&j<=2)||i==2&j>4||(j+i==7&i<=3)||i==j&i<=2){
					System.out.print("*");
				}else
					
					System.out.print(" ");
				}
			System.out.println();
			}
			
		}

	public static  void PatternN() {

		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(j==1||j==5||i==j){
					System.out.print("*");
				}else
					
					System.out.print(" ");
				}
			System.out.println();
			}
			
		}
	
	public static  void PatternO() {

		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if((i==1&j>=2&j<=4)||(j==1&i>=2&i<=4)||(j==5&i>=2&i<=4)||(i==5&j<=4&j>=2)){
					System.out.print(" *");
				}else
					
					System.out.print("  ");
				}
			System.out.println();
			}

		
		}

	public static  void PatternP() {

	System.out.println(" ");
	for(i=1;i<=5;i++) {
		for(j=1;j<=5;j++) {
			if(j==1||(i==1&j<5)||(i==3&j<5)||(j==4&i<=2)){
				System.out.print(" *");
			}else
				
				System.out.print("  ");
			}
		System.out.println();
	
	}
  }

	public static  void PatternQ() {

	System.out.println(" ");
	for(i=1;i<=6;i++) {
		for(j=1;j<=6;j++) {
			if((j==1&i<=5)||(j==5&i<=5)||(i==1&j<=5)||(i==5&j<=5)||(i==j&i>2)){
				System.out.print(" *");
			}else
				
				System.out.print("  ");
			}
		System.out.println();
	
	}
	
 }

	public static  void PatternR() {

	System.out.println(" ");
	for(i=1;i<=5;i++) {
		for(j=1;j<=5;j++) {
			if(j==1||(i==1&j<5)||(i==3&j<5)||(j==4&i<=2)||(i+j==k)){
				System.out.print(" *");
			}else
				
				System.out.print("  ");
			}
		System.out.println();
		k=k+2;
	
	}
  }

	public static  void PatternS() {

		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i==1||i==3||i==5||(j==1&i<3)||(j==5&i>3)){
					System.out.print(" *");
				}else
					
					System.out.print("  ");
				}
			System.out.println();
			k=k+2;
		
		}
	  }

	public static  void PatternT() {

		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i==1||j==3||(i==2&j<2)||(i==2&j>4)){
					System.out.print(" *");
				}else
					
					System.out.print("  ");
				}
			System.out.println();
			k=k+2;
		
		}
	  }
	
	public static  void PatternU() {

		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if((j==1&i<=4)||(j==5&i<=4)||(i==5&j>=2&j<=4)){
					System.out.print(" *");
				}else
					
					System.out.print("  ");
				}
			System.out.println();
			
		
		}
	  }
	
	public static  void PatternV() {

		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if((j==1&i<=4)||(j==5&i<=4)||(i==5&j>=2&j<=4)){
					System.out.print(" *");
				}else
					
					System.out.print("  ");
				}
			System.out.println();
			
		
		}
	  }

	public static  void PatternW() {

		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(j==1||j==5||(j+i==6&j<3)||(j==i&j>2)){
					System.out.print(" *");
				}else
					
					System.out.print("  ");
				}
			System.out.println();
			
		
		}
	  }

	public static  void PatternX() {

		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i==j||i+j==6){
					System.out.print(" *");
				}else
					
					System.out.print("  ");
				}
			System.out.println();
			
		
		}
	  }

	public static  void PatternY() {

		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if((i==j&i<3)||(i+j==6&i<3)||(j==3&i>2)){
					System.out.print(" *");
				}else
					
					System.out.print("  ");
				}
			System.out.println();
			
		
		}
	  }

	public static  void PatternZ() {

		System.out.println(" ");
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i==1||i==5||i+j==6){
					System.out.print(" *");
				}else
					
					System.out.print("  ");
				}
			System.out.println();
			
		
		}
	  }

}