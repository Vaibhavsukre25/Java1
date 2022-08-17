package ch6;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Before exception....");
		try {
		int i=1/Integer.parseInt(args[0]);
		}catch(ArithmeticException e){
			System.out.println("Please enter a value other than zero...");
		//System.out.println(e);
		}
	catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("You need to enter a value in command line...");
	}
		catch(NumberFormatException ne) {
			System.out.println("Please enter a valid number other than zero...");
		}
		catch(Exception ee) {
			System.out.println("Unknown exceptions...come here...");
		}
		System.out.println("After exception....");
	}

}
