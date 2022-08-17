package runall;

public class TypeCasting4 {

	public static void main(String[] args) {
		
		char c='a';
		byte cc=(byte)c;//int and char are compatible types in java
		
		float f=c;
		float ff=100.3f;
		System.out.println((char)cc);
		System.out.println((char)f);
		
		int ccc=169;//32bit;
		
		System.out.println((char)ccc);
	}
}
