package runall;

public class Continue1 {
	public static void main(String[] args) {
		
int i=0;
		
		while(i<10) {
			if(i%2==1) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
