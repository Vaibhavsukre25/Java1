package exercise;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int radius = scan.nextInt();
		
		double AreaOfCircle = Math.PI*radius*radius;
		System.out.println(AreaOfCircle);
		
		for(int i=1;i<=10;i++) {
			int tab = 2*i;
			System.out.println(tab);
		}
		
		
	}

}
