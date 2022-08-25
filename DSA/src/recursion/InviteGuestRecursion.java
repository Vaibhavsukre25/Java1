package recursion;

public class InviteGuestRecursion {
	
	public static int Callguest(int n) {
		if(n<=1) {
			return 1;
		}
		
		int way1 = Callguest(n-1);
		int way2 = Callguest(n-2) * (n-1);
		
		return way1+way2;
	}
	
	public static void main(String[] args) {
		int n = 4;
		System.out.println(Callguest(n));
		
	}

}
