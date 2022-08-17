package exercise;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
