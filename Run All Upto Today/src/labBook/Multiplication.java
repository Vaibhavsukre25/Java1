package labBook;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a nunber....");
		int i = scan.nextInt();
		System.out.println("Enter a another number.....");
		int j= scan.nextInt();
		
		int multi = i*j;
		System.out.println("Multiplication of two numbers is......"+multi);
		
		int sub = i-j;
		System.out.println("substraction of two numbers is......"+sub);
		int div  = i/j;
		System.out.println("division with questint of two numbers is......"+div);
		int div1 = i%j;
		System.out.println("division with reminder of two numbers is......"+div1);
		int add = i+j;
		System.out.println("addition of two numbers is......"+add);
		
	}

}
