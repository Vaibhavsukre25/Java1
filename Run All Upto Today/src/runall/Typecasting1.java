package runall;

public class Typecasting1 {
	public static void main(String[] args) {
		
         int i=100;//32 bit
		
		met((byte)i);//this is what we call it as type casting
		//in this casting we have converted int to byte
		
		byte b=(byte)i;
		met(b);
		System.out.println(b);
		
		// the above casting is higher to lower..
		//but it has a problem
		
		int x=257;
		byte bx=(byte)x;
		System.out.println(bx);
	}
	//I have written a method which can accept a byte
	static void met(byte b) {//8 bit
		
	}
	}

