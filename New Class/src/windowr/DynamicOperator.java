package windowr;

import java.util.Scanner;

public class DynamicOperator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number.....");
		int num1= scan.nextInt();
		System.out.println("Enter another number");
		int num2 = scan.nextInt();
		int add = num1+num2;
		System.out.println(add);
		int sub = num1-num2;
		System.out.println(sub);
		int multi = num1*num2;
		System.out.println(multi);
		int diviWithQ = num1/num2;
		System.out.println(diviWithQ);
		int diviWithR= num1%num2;
		System.out.println(diviWithR);
		System.out.println(num1==num2);
	}
}
