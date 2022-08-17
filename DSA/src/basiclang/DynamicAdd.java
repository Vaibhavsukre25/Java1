package basiclang;

import java.util.Scanner;

public class DynamicAdd {
    public static void main(String[] args) {
		
    	Scanner scan = new Scanner(System.in);
    	
    	String s = scan.nextLine();
    	int i= scan.nextInt();
    	
    	System.out.println(s + "This is my name and my age is..: "+ i);
	}
}
