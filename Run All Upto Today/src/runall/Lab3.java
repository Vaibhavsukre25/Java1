package runall;

import java.util.Scanner;
//Multiply Two Numbers. accept them from user
public class Lab3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter first number..:");
		int n1=scan.nextInt();
		System.out.println("Please enter second number..:");
		int n2=scan.nextInt();
		
		int result=n1*n2;
		int esult=n1-n2;
		
		
		System.out.println("Multiplication of n1 and n2 is..:"+result);
		System.out.println("Substraction of n1 and n2 is..:"+esult);
	}
}


