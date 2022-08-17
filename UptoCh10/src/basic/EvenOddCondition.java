package basic;

import java.util.Scanner;

public class EvenOddCondition {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number........");
		int num = scan.nextInt();
		
		int var = num%2;
		
		
		
		String result = (var==0)?"Even Number......":"Odd Number....";
		System.out.println(result);
		
		if(var==0) {
			System.out.println(num +" -->> It is Even number......");
			
		}
		else {
			System.out.println(num+ " -->> It is Odd Number.....");
		}
	}

}
