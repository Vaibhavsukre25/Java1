package recursion;

public class XToThePowerNRecursion {

	public static int calpower(int x, int n) {
		if(n==0) {
			return 1;
		}
		if(x==0) {
			return 0;
		}
		
		int XPowerNM1 = calpower(x, n-1);
		int XpowerN = x * XPowerNM1;
		return XpowerN;
	}
	
	public static void main(String[] args) {
		
		int x=2; int n=5;
		int ans = calpower(x, n);
		
		System.out.println(ans);
	}
}
