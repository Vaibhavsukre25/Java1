package windowr;

public class EnhancedForLoop {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		
		for(int i:arr) {
			System.out.println(i);
			
		};
		int twod[][]= {
				{10,20,30,40},
				{100,200,300,400},
				{1000,2000,3000,4000}	
		};
		
		for(int i[]:twod) {
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
		};
	}

}
