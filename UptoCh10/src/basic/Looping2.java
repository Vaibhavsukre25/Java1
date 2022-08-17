package basic;

public class Looping2 {
	public static void main(String[] args) {
		
		int i=10;
		while(i>0) {
			System.out.println("Loop called...."+i);
			i--;
			
		}
		
		i=5;
		do {
			System.out.println("Loop excuted...."+i);
			i--;
		}while(i>0);
		
		i=1;
		do {
			System.out.println("loop......"+i);
			i++;
		}while(i<10);
	}

}
