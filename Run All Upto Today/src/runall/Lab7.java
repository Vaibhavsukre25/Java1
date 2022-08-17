package runall;

//print whether  the  given number is odd or even
import java.util.Scanner;
public class Lab7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number..:");
		int n=scan.nextInt();
		System.out.println("Please enter number 2....");
		int n2=scan.nextInt();
		
		if(n%2==0) {
			System.out.println("Even Number....");
		}
		else {
			System.out.println("Odd Number....");
		}
		
		System.out.println((n2%2==0)?"Even Number..":"Odd Number...");
	}
}

