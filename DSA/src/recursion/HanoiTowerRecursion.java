package recursion;

public class HanoiTowerRecursion {
	
	public static void TowerOfHanoi(int n, String src , String Helper , String Destination) {
		
		if(n==1) {
			System.out.println("Transfer" + n + " from" + src + "to" + Destination);
			return;
		}
		TowerOfHanoi(n-1, src, Destination, Helper);
		System.out.println("Transfer" + n + " from" + src + "to" + Destination);
		TowerOfHanoi(n-1, Helper, src, Destination);
		
	}
	
	
	public static void main(String[] args) {
		int n=3;
		TowerOfHanoi(n, "S", "H" , "D");
	}

}
