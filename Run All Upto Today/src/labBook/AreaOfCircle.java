
package labBook;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of circle.....");
		double radius = scan.nextDouble();
		//area = pi*radius*radius;
		double area = Math.PI*(radius*radius);
		System.out.println("Area of circle is.......:"+area);
		//circumference = 2*pi*radius;
		double Circumference = Math.PI*2*radius;
		System.out.println("The Circumference of circle is...:"+Circumference);
	}

}
