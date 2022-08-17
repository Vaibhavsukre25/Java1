package basic;

import java.util.Scanner;

public class Initilization {
	public static void main(String[] args) {
		
		int i;
		i=1000000000;
		System.out.println(i);
		Scanner scan = new Scanner(System.in);
		
		byte b = scan.nextByte();
		
		
		byte b1=127;
		System.out.println(b);
		
		float f=10;
		float f1=10.5f;
		double d= 25.56;
		
		char c=25;
		System.out.println(c);
		c='s';
		System.out.println(c);
		
		String msg = "New cm of maharastra.......";
		String msg1 = new String("I am not.......");
		
		System.out.println("msg..........."  + msg + msg1);
		
	}

}
