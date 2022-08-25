package raw;

import java.util.Scanner;

public class SmallestIntegerValue {
         
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		findInt(sc.nextInt());
	}	
	
	
	public static void findInt(int a ) {
		int i,j=0;
		int arr[] = new int[10000];
		if(a<10) {
			System.out.println(a+10);
			return;
		}
		
		for(i=9;i>1;i--) {
			while(a%i==0) {
				a=a/i;
				arr[j] = i;
				j++;
			}
		}
		if(a>10) {
			System.out.println("Not possible");
			return;
		}
		for(i=j-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}
}
