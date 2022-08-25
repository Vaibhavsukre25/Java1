package recursion;

public class SortedRecursion {
	
	public static boolean IsSorted(int arr[] , int idx) {
		if(idx == arr.length-1) {
			return true;
		}
		
		if(arr[idx] < arr[idx+1]) {
			return IsSorted(arr, idx+1);
		}
		else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5,4,5};
		System.out.println(IsSorted(arr, 0));
	}

}
