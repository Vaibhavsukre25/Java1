package exercise;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		
		switch(month) {
		case 1:{
			System.out.println("month is jan......");
			break;
		}
		case 2:{
			System.out.println("month is feb.....");
			break;
		}
		case 3:{
			System.out.println("month is march.....");
			break;
		}
		default:{
			System.out.println("check again that exceeds above months");
		}
		}
	}

}
