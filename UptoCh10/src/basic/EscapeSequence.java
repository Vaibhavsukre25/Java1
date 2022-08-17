package basic;

public class EscapeSequence {
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		System.out.println("\"Hello World\"");
		System.out.println("Hello \n\t\t World");
		
		int count=0;
		while(true) {
			System.out.println("\t\t"+ count++ + "\r");
		}
	}

}
