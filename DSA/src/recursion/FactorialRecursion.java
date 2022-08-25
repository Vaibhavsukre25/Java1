package recursion;

public class FactorialRecursion {
	public static int calculatefact(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		
		int factofnm1 = calculatefact(n-1);
		int factofn = n* factofnm1;
		return factofn;
	}
	
	public static void main(String[] args) {
		int n=10;
		int ans = calculatefact(n);
		System.out.println(ans);
	}

}
