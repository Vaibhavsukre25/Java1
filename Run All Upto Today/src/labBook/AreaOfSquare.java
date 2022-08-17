package labBook;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a side of a square.:");
		double side = scan.nextDouble();
		double Area = side* side;
		System.out.println("Area of a square is....:"+Area);
	}

}
