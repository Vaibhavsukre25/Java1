package labBook;

import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String[] args) {
		Scanner vaibhav = new Scanner(System.in);
		System.out.println("Enter a number......");
		int dividend= vaibhav.nextInt();
		System.out.println("Enter a another number....");
		int diviser=vaibhav.nextInt();
		
		int quotient = dividend/diviser;
		System.out.println(quotient);
		int remainder= dividend %diviser;
		System.out.println(remainder);
		
	}

}
