package recursion;

public class PlaceTilesRecursion {
	
	public static int placeTiles(int n , int m) {
		
		if(n==m) {
			return 2;
		}
		if(n < m) {
			return 1;
		}
		
		int verplace = placeTiles(n-m, m);
		int horplace = placeTiles(n-1, m);
		
		return verplace+ horplace;
	}
	
	
	public static void main(String[] args) {
		int n=4; int m=2;
		System.out.println(placeTiles(n, m));
		
	}

}
