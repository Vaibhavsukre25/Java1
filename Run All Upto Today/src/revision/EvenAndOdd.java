package revision;

import java.util.Scanner;

public class EvenAndOdd {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number......");
        int i= scan.nextInt();
        if(i%2==0) {
        	System.out.println("Number is even...");
        }
        else {
        	System.out.println("Number is odd..");
        }
	}

}
