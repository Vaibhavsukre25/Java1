package revision;

import java.util.Scanner;

public class Floydtriangle {
	public static void main(String[] args) {
		
		int rows, number=1, j,counter;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a rows of floyd triangle");
		rows = scan.nextInt();
		System.out.println("Floyd Triangle");
		
		System.out.println("********************");
		
		for(counter=1;counter<=rows;counter++) {
			for(j=1;j<=counter;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println(" ");
		}
	}

}
