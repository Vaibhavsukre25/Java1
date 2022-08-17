package windowr;

public class Looping1 {
	public static void main(String[] args) {
		
		for(int i=10;i>0;i--) {
			System.out.println("Loop will executes...."+i);
		}
		int count=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*   "+(++count));
			}
			System.out.println();
		}
	}

}