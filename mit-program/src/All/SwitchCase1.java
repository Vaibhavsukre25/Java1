package All;

import java.util.Scanner;

public class SwitchCase1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter A number......");
		int i = scan.nextInt();
		switch(i) {
		case 100 :{
			System.out.println("Value is hundred....");
			break;
		}
		case 200:{
			System.out.println("value is two hundred..");
			break;
		}
		case 300:{
			System.out.println("Value is three hundred.....");
			break;
		}
		default :{
			System.out.println("The value is not valid....");
		}
		}
	}
}
