package basiclang;

import java.util.Scanner;

public class TwoDArrays {
	public static void main(String[] args) {
		
		Scanner  scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		
		int numbers[][] = new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				numbers[i][j] = scan.nextInt();
			}
		}
		int x= scan.nextInt();
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(numbers[i][j]==x) {
				   System.out.println("x found at indices.."+(i+","+ j));
				}
			}
		}
		
	}

}
