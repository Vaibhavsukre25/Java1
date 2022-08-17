package revision;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a radius of circle");
		double r = scan.nextDouble();
		double area = Math.PI*r*r;
		System.out.println(area);
		double circumference = Math.PI*2*r;
		System.out.println(circumference);
	}

}
