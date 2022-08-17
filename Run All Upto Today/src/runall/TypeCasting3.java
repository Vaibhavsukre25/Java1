package runall;

public class TypeCasting3 {

	public static void main(String[] args) {
		
		int i=100;//32 bit
		
		//higher to lower
		byte b=(byte)i;
		System.out.println(b);
		// the above casting is higher to lower..
		//but it has a problem
		
		int x=257;
		byte bx=(byte)x;//type casting int to byte
		System.out.println(bx);
		
		//lower to higher no problem
		
		byte xx=120;
		int xxi=xx;//automatic type promotion
		System.out.println(xxi);
		
		//note: Remember type casting always happens between related or compatible types
		

	}
}
