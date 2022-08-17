package basiclang;

import java.util.Scanner;

public class SpiralMatrix {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int m= scan.nextInt();
		
		int matrix[][] = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("The sppiral order matrix is : ");
		int rowStart = 0;
		int rowEnd = n-1;
		int colStart =0;
		int colEnd = m-1;
		
		while(rowStart <= rowEnd && colStart<=colEnd) {
			for(int col=colStart; col<=colEnd;col++) {
				System.out.println(matrix[rowStart][col] + " ");
			}
			rowStart++;
		}
	}

}
