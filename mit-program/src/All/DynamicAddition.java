package All;

import java.util.Scanner;

public class DynamicAddition {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter one number.....");
		int num1 = scan.nextInt();
		System.out.println("Enter another number.....");
		int num2 = scan.nextInt();
		int sum= num1+num2;
		System.out.println("Sum is...."+sum);
		
		
		
		String n1="100";
		String n2="200";
		System.out.println(n1+n2);
		int r1 = Integer.parseInt(n1);
		int r2 = Integer.parseInt(n2);
		System.out.println(r1+r2);
		System.out.println(Integer.parseInt(n1)+Integer.parseInt(n2));
		
	}

}
