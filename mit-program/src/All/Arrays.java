package All;

public class Arrays {
	public static void main(String[] args) {
		
		int arr[] = {12,23,34,45,56,67,78,89,90};
		int n = arr.length;
		System.out.println(n);
		System.out.println("The numbers are....");
		
		for(int i=0;i<n;i++) {
			System.out.println(""+arr[i]);
		}
		
		int arr2[] = new int [3];
		System.out.println(arr2.length);
	}

}
