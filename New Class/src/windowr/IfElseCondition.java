package windowr;

import java.util.Scanner;

public class IfElseCondition {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number....");
		int num = scan.nextInt();
		
		int result = (num%2);
		boolean b = (result==0);
		
		if(b) {
			System.out.println("Even Number.....");
		}
		else {
			System.out.println("Odd Number......");
		}
		
	}

}
