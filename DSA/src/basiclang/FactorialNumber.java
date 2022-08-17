package basiclang;

import java.util.Scanner;

public class FactorialNumber {
	public static void FactoralN(int n) {
		int fact = 1;
		if(n<1) {
			System.out.println("invalid number......");
			return;
		}
		for(int i=n;i>1;i--) {
			fact = fact*i;
			
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		FactoralN(n);
	}

}
