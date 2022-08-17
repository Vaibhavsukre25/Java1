package labBook;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		
		int num, sum=0;
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Please enter a integer value below 10");
	    num = Scan.nextInt();
	    while(num<10) {
	    	sum=sum+num;
	    	num++;
	    }
	    System.out.format("Sum of the numbers from the while loop is :  "+sum);
	    
	    
	}

}
