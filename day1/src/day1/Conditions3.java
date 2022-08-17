package day1;

public class Conditions3 {
	public static void main(String[] args) {
		int i=101;
		
		// 1st way
		if(i%2==0) {
			System.out.println("Even Number......");
		}
		if(i%2!=0) {
			System.out.println("Odd Number.......");
		}
		
		//2nd way
		if(i%2==0) {
			System.out.println("Even Number....");
		}
		else {
			System.out.println("Odd Number......");
		}
		
		//3rd way
		int age=555;
		if (age<10) {
			System.out.println("You are child....");
		}
		if(age<20) {
			System.out.println("You are below 20....");
		}
		if(age<50) {
			System.out.println("You are young.....");
		}
		else {
			System.out.println("You are died man");
		}
		//4th way

		if (age<10) {
			System.out.println("You are child....");
		}
		else if(age<20) {
			System.out.println("You are below 20....");
		}
		else if(age<50) {
			System.out.println("You are young.....");
		}
		else {
			System.out.println("You are died man");
		}
	}

}
