package basiclang;

import java.util.Scanner;

public class FuctionsPrintMyName {
	
	/*public static void PrintMyName(String name) {
		System.out.println(name);
		return;
	}*/
	
	public static int CalculateSum(int a,int b) {
		int product = a*b;
		return product;
		
	}
	
        public static void main(String[] args) {
	 
        	 Scanner scan = new Scanner(System.in);
        	 
        	 int a = scan.nextInt();
        	 int b= scan.nextInt();
        	 
        	 int product = CalculateSum(a, b);
        	 System.out.println(product);
        	 
        	 //String name = scan.next();
        	 
        	// PrintMyName(name);
      }
}
