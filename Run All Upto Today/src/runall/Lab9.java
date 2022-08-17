package runall;

//find the largest among the 3 numbers...
public class Lab9 {
	public static void main(String[] args) {
		int n1=400;
		int n2=200;
		int n3=450;
		
		if(n1>=n2 && n1>=n3) {
			System.out.println("n1 is baap of all....");
		}
		else if(n2>=n1 && n2>=n3) {
			System.out.println("n2 is baap of all....");
		}
		else {
			System.out.println("n3 is the baap....");
		}
	}
}
