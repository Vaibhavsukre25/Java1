package labBook;

public class NestedLoop {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=3;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
				System.out.print(j);
			}
			System.out.print(" ");
			System.out.print(i);
		}
	}

}
