package labBook;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a base Of Triangle");
		double base = scan.nextDouble();
		System.out.println("Enter a height of Triangle.");
		double height = scan.nextDouble();
		 
		//area = (base*height)/2;
		double area = (base*height)/2;
		System.out.println("Area of Triangle is .......: "+area);
	}

}
