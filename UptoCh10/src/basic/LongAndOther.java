package basic;

import com.sun.jdi.Value;

public class LongAndOther {
	public static void main(String[] args) {
		
		long l=254;
		l=new Long(254);
        l= Long.valueOf(254);
        
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.SIZE);
		System.out.println(Long.max(254, 2545));
		System.out.println(Long.min(254, 654));
		System.out.println(Long.sum(654, 454));
		
		Short s= 21;
		System.out.println(Short.MAX_VALUE);
		
		byte b=25;
		System.out.println(Byte.MAX_VALUE);
		
		float f=254.5f;
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		char c='5';
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.BYTES);
		System.out.println(Character.hashCode(c));
		
		String ss= "Vaibhav";
		System.out.println(String.valueOf(25));
		System.out.println(String.valueOf(8795));
		System.out.println(String.valueOf(15.21));
		
		
		
	}

}
