package labBook;

import java.util.Scanner;

// dynamic method
public class AdditionDynamic {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a frist number....");
		int i = scan.nextInt();
		System.out.println("Enter a second number....");
		int j= scan.nextInt();
		System.out.println("Enter a third number....");
		int k=scan.nextInt();
		
		int addition=i+j+k;
		System.out.println("sum of numbers is...."+addition);
		
		System.out.println("Enter a name....");
		String s= scan.next();
		System.out.println("result of two is......"+(s+addition));
	}

}
