package basiclang;

import java.util.Scanner;

public class ArrayBasic {
	public static void main(String[] args) {
		
		//int marks[] = {135,65,77,99};
		Scanner scan = new Scanner(System.in);
		int size = scan . nextInt ();
		String names [] = new String [ size ];
		
		//input
		for ( int i = 0 ; i < size ; i++) {
		names [ i ] = scan . next ();
		}
		//output
		for ( int i = 0 ; i < names . length ; i ++) {
		System . out . println ( "name " + ( i+1) + " is : " + names [ i ]);
		}
		}
		/*int marks[] = new int[size];
		
		System.out.println(marks[1]);
		for(int i=0;i<size;i++) {
			System.out.print(marks[i]);
}*/


}
