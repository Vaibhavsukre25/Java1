package basiclang;

public class SolidRhombusPatternPrinting {
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				int spaces = n-i;
				System.out.print(" ");
			}
			
			for(int j=1;j<=n ;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
