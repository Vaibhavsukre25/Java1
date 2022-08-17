package labBook;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		//for dynamic input
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a frist number......");
		double n1=scan.nextDouble();
		System.out.println("Enter a second number.........");
		double n2 = scan.nextDouble();
		System.out.println("Enter a third number......");
		double n3 = scan.nextDouble();
		
		//double n1=4, n2=8, n3=5;
		if(n1>=n2 && n1>=n3) {
			System.out.println(n1+ " Is a largest Number.");
		}
		else if(n2>=n1 && n2>=n3) {
			System.out.println(n2 +" Is a largest Number.");
		}
		else {
			System.out.println(n3 + " is a largest number.");
		}
	}

}
