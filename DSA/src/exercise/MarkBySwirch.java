package exercise;

import java.util.Scanner;

public class MarkBySwirch {
	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				sum = sum+i;
			}
			
		}
		System.out.println(sum);
		/*for(int i=2;i<n;i++) {
			int checkprime = i%2;
			if(checkprime==0) {
				System.out.println("Number is not prime.....");
			}
			else {
				System.out.println("number is prime.....");
			}
			
		}*/
		
		
	}

}
