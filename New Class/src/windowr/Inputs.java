package windowr;

import java.util.Scanner;

public class Inputs {
     public static void main(String[] args) {
		
    	 Scanner scan= new Scanner(System.in);
    	 System.out.println("Please enter a number.....");
    	 int n = scan.nextInt();
    	 System.out.println(n);
    	 
    	 System.out.println("Please enter a name......");
    	 String s = scan.next();
    	 System.out.println(s);
    	 System.out.println(s+n);
	}
}
