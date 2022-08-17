package basic;

public class ArrayBasic2 {
	public static void main(String[] args) {
		
		int arr[][] = {
				{1,2,3,4},
				{5,6,7,8}
		};
		System.out.println(arr.length);
		System.out.println(arr[1][0]);
		
		int arr2[][]= new int[2][3];
		System.out.println(arr2[0][0]);
		
		arr2[0][1] = 215;
		
		System.out.println(arr2[0][1]);
		
		
	}

}
