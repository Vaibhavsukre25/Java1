package basiclang;

import java.util.Scanner;

public class GretherAndLesser {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first number......");
		int a = scan.nextInt();
		System.out.println("Enter a second number...");
		int b= scan.nextInt();
		if(a==b) {
			System.out.println("numbers are equal.....");
		}
		else if(a>b) {
			System.out.println("a is greather than b.........");
		}
		else {
			System.out.println("b is greather than b.........");
		}
	}

}
