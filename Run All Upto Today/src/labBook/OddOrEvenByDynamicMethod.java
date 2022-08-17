package labBook;

import java.util.Scanner;

public class OddOrEvenByDynamicMethod {
	public static void main(String[] args) {
		
		Scanner vaibhav = new Scanner(System.in);
		System.out.println("Enter a number......");
		int num= vaibhav.nextInt();
		
		int res=num%2;
		if(res==0) 
			System.out.println("Even number....");
			
		
		else 
			System.out.println("Odd Number.....");
		
	}

}
