package basic;

public class EnhancedForLoop {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		for(int i:arr){
			System.out.println(i);
		};
		
		int twod[][]= {
				{25,12,32,14},
				{14,35,68,98},
				{14,85,75,96}
		};
		
		for(int i[]:twod) {
			for(int j:i) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}
	}

}
