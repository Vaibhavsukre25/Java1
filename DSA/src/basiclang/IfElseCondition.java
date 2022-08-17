package basiclang;

import java.util.Scanner;

public class IfElseCondition {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a age...");
		int age = scan.nextInt();
		
		if(age>=18) {
			System.out.println("You are adult....");
		}
		else if(age ==0){
			System.out.println("You are not born ");
		}
		else {
			System.out.println("You are teneger......");
		}
	}

}
