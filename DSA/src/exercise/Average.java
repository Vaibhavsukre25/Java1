package exercise;

import java.util.Scanner;

public class Average {
	
	public static void averageofnumbers(int a,int b,int c) {
		int average = (a+b+c)/3;
		System.out.println(average);
		return;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b= scan.nextInt();
		int c = scan.nextInt();
		averageofnumbers(a, b,c);
		
	}

}
