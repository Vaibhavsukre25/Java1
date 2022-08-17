package basic;

public class ArrayBasic {
	public static void main(String[] args) {
		
		int arr[]= {25,34,65,73};
		System.out.println(arr[0]);
		System.out.println(arr[3]);
		System.out.println(arr.length);
		System.out.println(arr.hashCode());
		
		int arr2[]= new int[2];
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		arr2[0]=5000;
		System.out.println(arr2[0]);
		
		int []sgm = new int[25];
		System.out.println(sgm.length);
		
		int num1[]= {1,2,3,4};
		int num2[]= {9,8,7,6};
		int res = num1[2]-num2[2];
		System.out.println(res);
		
	}

}
