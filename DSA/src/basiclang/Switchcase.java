package basiclang;

//import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Name......");
	    char button = scan.next().charAt(0);
		
		switch(button) {
		case 'S' :{
			System.out.println("Sas riya kal....");
			break;
		}
		case 'H':{
			System.out.println("Namaste......");
			break;
		}
		case 'M':{
			System.out.println("A salam Valukum");
			break;
		}
		default :{
			System.out.println("Hello.....");
		}
		}
	}

}
