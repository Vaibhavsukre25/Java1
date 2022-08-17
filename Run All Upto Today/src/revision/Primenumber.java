package revision;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int temp;
		boolean isprime=true;
		
		System.out.println("enter a number....");
		int num = scan.nextInt();
		
		for(int i=2;i<num;i++) {
			//temp = num%i;
			if(num%i==0) {
			 isprime=false;
			 break;
			 
			}
		}
		if(isprime) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num + " is a not a prime number");
		}
	}

}
