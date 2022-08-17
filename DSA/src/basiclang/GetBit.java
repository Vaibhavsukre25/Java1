package basiclang;

public class GetBit {
	public static void main(String[] args) {
		int n=5;
		int pos = 2;
		int BitMask = 1<<pos;
		//For Get Bit
		/*if((BitMask & n)==0) {
			System.out.println("bit is zero...");
		}
		else {
			System.out.println("bit is one.....");
		}*/
		
		//For Set Bit.....
/*		int NewNumber = BitMask | n;
		System.out.println(NewNumber);*/
		
		int NotBitMask = ~(BitMask);
		int NewNumber = NotBitMask & n;
		System.out.println(NewNumber);
	}

}
