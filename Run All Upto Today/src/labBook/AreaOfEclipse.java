package labBook;

import java.util.Scanner;

public class AreaOfEclipse {
	public static void main(String[] args) {
		//area = pi*a*b;
		double pi = 3.14;
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter a base of eclipse....:");
		double base = Scan.nextDouble();
		System.out.println("Enter a height of eclipse....");
		double height = Scan.nextDouble();
		double area = pi*base*height;
		System.out.println("Area of Eclipse is......: "+area);
		
	}
	

}
