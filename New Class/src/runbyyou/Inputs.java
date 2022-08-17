package runbyyou;

import java.util.Scanner;

public class Inputs {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		int n1=scan.nextInt();
		System.out.println("Please Enter another number");
		int n2=scan.nextInt();
		int sum = n1+n2;
		
		System.out.println("sum of numbers...."+sum);
		
		System.out.println("Enter Your Name....");
		String s = scan.next();
		System.out.println("My name is....."+s);
	}

}
