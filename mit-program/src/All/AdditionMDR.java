package All;

import java.util.Scanner;

public class AdditionMDR {
    public static void main(String[] args) {
		
    	int i=6;
    	System.out.println(i/4);
    	System.out.println(i%4);
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter frist name....");
    	String s1 = scan.next();
    	System.out.println("Enter a surname.....");
    	String s2 = scan.next();
    	
        //String s1 = "Vaibhav";
        //String s2 = "Sukre";
        String S = s1 + " " + s2;
        
        System.out.println("My Name is...."+ S + " CEO of" + s1 + " Foundation");
	}
}