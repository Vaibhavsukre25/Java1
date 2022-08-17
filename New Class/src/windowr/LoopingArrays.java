package windowr;

public class LoopingArrays {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		int twod[][]= {
				{10,20,30,40},
				{100,200,300,400},
				{1000,2000,3000,4000}	
		};
		
		for(int i=0;i<twod.length;i++) {
			for(int j=0;j<twod[i].length;j++) {
				System.out.print(twod[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
