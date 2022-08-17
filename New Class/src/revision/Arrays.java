package revision;

public class Arrays {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}
	
	
	int twod[][] = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	
	for(int i=0;i<twod.length;i++) {
		for(int j=0; j<twod[i].length;j++) {
			System.out.println(twod[i][j]+"\t");
			System.out.println();
		}
		System.out.println();
	}
}
}
