package onlyrun;

import java.util.Scanner;

public class ImputFromKeyboard {
	public static void main(String[] args) {
		//INPUT
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number....:");
		int num1=scan.nextInt();//this line will accept a input from the keyboard
		
		System.out.println("Please enter another number....:");
		int num2=scan.nextInt();//this will accept another number from your keyboard
		
		int sum=num1+num2;//PROCESS- of addition
		
		System.out.println("The sum of two numbers given is...:"+sum);//OUTPUT
		
	}
}
