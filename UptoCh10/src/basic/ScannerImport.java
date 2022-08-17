package basic;

import java.util.Scanner;

public class ScannerImport {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sub,mul,div,div1;
		
		System.out.println("Enter a first number.........");
		
		int num1 = scan.nextInt();
		System.out.println("num1 is.......:" + num1);
		
        System.out.println("Enter a second number......");
		
		int num2 = scan.nextInt();
		
		int add = num1+num2;
		
		System.out.println("addition of two numbers........:"+ add);
		System.out.println("multiplication  of two numbers......:" + (mul = num1*num2));
		System.out.println("divide with questiont of two numbers......:" + (div = num1/num2));
		System.out.println("divide with reminder of two numbers......:" + (div1 = num1%num2));
		System.out.println(num1!=num2);
	}
}
