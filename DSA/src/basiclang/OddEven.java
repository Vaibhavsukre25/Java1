package basiclang;

import java.util.Scanner;

//import com.sun.java_cup.internal.runtime.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter a number.......");
		n= scan.nextInt();
		int result = n%2;
		if(/*result==0*/(n%2)==0) {
			System.out.println( n + " number is Even");
		}
		else {
			System.out.println( n + " number is odd.....");
		}
	}

}
