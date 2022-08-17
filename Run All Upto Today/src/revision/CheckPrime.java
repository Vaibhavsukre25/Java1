package revision;

import java.util.Scanner;

public class CheckPrime {
	private static final boolean True = false;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i,temp;
		boolean isprime = true;
		
		System.out.println("Enter a number...");
		int num = scan.nextInt();
		
		for(i=2;i<num;i++) {
			temp = num%i;
			if(temp==0) {
				isprime = false;
				break;
				
			}
		}
		if(isprime) {
			System.out.println(num + " Is a prime number");
		}
		else {
			System.out.println(num + " Is a not prime number...");
		}
	}

}
