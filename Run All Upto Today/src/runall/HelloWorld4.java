package runall;

import java.util.Scanner;

public class HelloWorld4 {
	
	
	/*
	 * The objective of this program is to accept a static input from the user and print with welcome
	 * message
	 */
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			//static input
			//String name="VAibhav";
			String name= scan.next();
			
			
			System.out.println("Welcome to JAVA..."+name);
		}
	}

