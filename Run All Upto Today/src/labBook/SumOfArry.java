package labBook;

import java.util.Scanner;

public class SumOfArry {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int array[]= new int[5];
		int sum =0;
		System.out.println("Enter the elements...");
		for(int i=0;i<5;i++) {
			array[i]=scan.nextInt();
			
		}
		for(int num:array) {
			sum = sum+num;
			
		}
		System.out.println("Sum of array elements is.:"+sum);
	/*
	 * 	int array[]= { 10,20,30,40,50,10};
		int sum =0;
		for(int num:array) {
			sum = sum+num;
		}
		System.out.println("Sum of array elements is..:"+sum);
	 */
	}

}
