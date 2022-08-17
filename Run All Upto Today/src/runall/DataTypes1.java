package runall;

import java.util.Scanner;

public class DataTypes1 {
	public static void main(String[] args) {
		
	//byte holds 8 bit
			byte b=123;
			
			//short holds 16 bit
			short s=32000;
			
			//int hold 32 bit
			int i=223233;
			
			//long holds 64 bit
			long l=23232323;
			
			//static initialization
			int num1=200;
			int num2=300;
			System.out.println("The sum of num1 and num2 is..:"+(num1+num2));
			
			//dynamic initialization
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter number 1..:");
			int n1=scan.nextInt();
			
			
			System.out.println("Please enter number 2..:");
			int n2=scan.nextInt();
			System.out.println("The addition of n1 and n2 is..:"+(n1+n2));
		}
	}

