package All;

public class MultidimensionalArray {
	public static void main(String[] args) {
		
		int arg[][] = new int [][] {{1,2,3},{2,3,4},{3,4,5},{5,6,7}};
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arg[i][j]);
			}
			System.out.println();
		}
		
	}

}
