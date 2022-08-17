package windowr;

import java.util.Scanner;

public class Condition1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number.....:");
		int num = scan.nextInt();
		int val = num%2;
		System.out.println(val);
		boolean b = (val==0);
		System.out.println(b);
		
		String result = b? "Even Number......":"Odd Number....";
		System.out.println(result);
		
		System.out.println((num%2==0)?"Even number.....":"Odd number...");
	}

}
