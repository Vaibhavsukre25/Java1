package runall;

public class TypeCasting2 {
	public static void main(String[] args) {
		
int i=100;//32 bit
		
		registerAge((byte)i);//this is what we call it as type casting
		//in this casting we have converted int to byte
		
		byte b=(byte)i;
	
		
		// the above casting is higher to lower..
		//but it has a problem
		
		int x=27;
		byte bx=(byte)x;//type casting int to byte
		System.out.println(bx);
	}
	//I have written a method which can accept a byte
	static void registerAge(byte b) {//8 bit
		
	}
}
