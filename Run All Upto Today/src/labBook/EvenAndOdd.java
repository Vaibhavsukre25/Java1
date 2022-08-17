package labBook;

import java.util.Scanner;

public class EvenAndOdd {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number......");
		
		int n = scan.nextInt();
		
		if(n%2==0)
			System.out.println("Number is Even");
		else 
			System.out.println("Number is odd");
	}

}
