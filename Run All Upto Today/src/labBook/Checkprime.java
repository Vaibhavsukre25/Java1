package labBook;

import java.util.Scanner;

public class Checkprime {
	public static void main(String[] args) {
		
		int temp;
		boolean isprime=true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = scan.nextInt();
		//scan.close();
		for(int i=2;i< num;i++) {
			temp=num%i;
			if(temp==0) {
				isprime=false;
				break;
			}
		}
		if(isprime) {
			System.out.println(num+ " is a prime number");
		}
		else {
			System.out.println(num + " is not a prime number");
		}
	}

}
