package runall;

public class Conditions2 {
	public static void main(String[] args) {
		
int n=11%2;
		
		if(n==0) {
			System.out.println("even number....");
		}
		else if(n!=0) {
			System.out.println("odd number....");
		}
		
		
		boolean result=(n==0);
		
		if(result) {
			System.out.println("even number....");
		}
		else if(!result) {
			System.out.println("odd number....");
		}
		
		//ternary operator
		System.out.println((10%2==0)?"Even number................":"Odd Number...................");
	}

}
