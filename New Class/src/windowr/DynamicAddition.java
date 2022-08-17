package windowr;

import java.util.Scanner;

public class DynamicAddition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number....");
		int num1 = scan.nextInt();
		System.out.println("Enter another number......");
	    int num2 = scan.nextInt();
	    int sum = num1 + num2 ;
	    System.out.println(sum);
	    int multi = num1*num2;
	    System.out.println(multi);
	    int sub = num1-num2;
	    System.out.println(sub);
	    int diviwithQ = num1%num2;
	    System.out.println(diviwithQ);
	    int diviwithR=num1/num2;
	    System.out.println(diviwithR);
	    
	    // Single line comment
	    /*
	     * multile line comment
	     * 
	     */
	    
	}
}
