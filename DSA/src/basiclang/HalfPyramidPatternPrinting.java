package basiclang;

public class HalfPyramidPatternPrinting {
	public static void main(String[] args) {
		
		// Half Pyramid downward...
		
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		// Reverse the Pyramid........
		/*int n=4;
	     for(int i=n;i>=1;i--) {
	    	 for(int j=1;j<=i;j++) {
	    		 System.out.print("*");
	    	 }
	    	 System.out.println();
	     }*/
		
		// Half Pyramid with 180 rotate...
		/*int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		// Half Pyramid With Numbers........
		int n=5;
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		
		// Inverted half pyramid with numbers...
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		//Floyds Triangle
		/*int number = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}*/
		
		// o-1 Traingle
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				int sum=i+j;
				if(sum%2==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
