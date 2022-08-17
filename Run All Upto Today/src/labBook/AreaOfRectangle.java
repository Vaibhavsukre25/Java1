package labBook;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a length of rectangle....:");
		double length = scan.nextDouble();
		System.out.println("Enter a width of rectangle...:");
		double width = scan.nextDouble();
		double area = length*width;
		System.out.println("Area of rectangle is .......: "+ area);
		
	}

}
