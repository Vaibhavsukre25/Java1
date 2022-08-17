package basic;

public class TypeCasting {
	public static void main(String[] args) {
		
		byte b=10;
		int i=b; // Automatic type promotion 
		System.out.println(i);
		
		i=258;
		b=(byte)i;
		System.out.println(b);
		
		byte num1=10;
		byte num2 = 2;
		float res=num1*num2;
		byte res1 = (byte)res;
		System.out.println(res1);
		System.out.println(res);
		
		char c='a';
		c=98;
		int cc=25;
		cc=c;
		System.out.println(cc);
		c=(char)cc;
		System.out.println(c);
		
		
		
		
		
	}

}
