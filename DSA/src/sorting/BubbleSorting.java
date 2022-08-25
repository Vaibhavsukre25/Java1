package sorting;

public class BubbleSorting {
	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		
		int arr[] = {7,8,3,5,1};
		// do it as acending order
		System.out.println(arr.length);
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				// For asending order........
				/*if(arr[j] > arr[j+1]) {
					// swaping of numbers
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;*/
				
				//For decending order........ 
				
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		printArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
