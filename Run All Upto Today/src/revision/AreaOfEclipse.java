package revision;

import java.util.Scanner;

public class AreaOfEclipse {
   public static void main(String[] args) {
	
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter a value of base of eclipse");
	   double base = scan.nextFloat();
	   System.out.println("Enter a value of height of eclipse");
	   double height = scan.nextFloat();
	   double area = Math.PI*base*height;
	   System.out.println(area);
	   
}
}
