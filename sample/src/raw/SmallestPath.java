package raw;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestPath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if(n<2) {
			System.out.println("Invalid Input");
		}
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		if(arr[0] == arr[n-1]) {
			System.out.println("Equal");
		}
		else {
			System.out.println(arr[0] +" ");
			System.out.println(arr[1]);
		}
	}

}
