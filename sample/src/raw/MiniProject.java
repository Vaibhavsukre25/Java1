package raw;

import java.util.Scanner;

public class MiniProject {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int mynumber = (int)(Math.random()*100) ;
		int usernumber = 0;
		
		do {
			System.out.println("Guess my number : ");
			usernumber = scan.nextInt();
			
			if(usernumber==mynumber) {
				System.out.println("WHOOO ! Your guess is right.");
				break;
			}
			else if(usernumber>mynumber) {
				System.out.println("Your number is too greather....");
			}
			else {
				System.out.println("Your number is too small .....");
			}
		}while(mynumber>0);
		
		System.out.println("My number was...."+mynumber);
	}

}
