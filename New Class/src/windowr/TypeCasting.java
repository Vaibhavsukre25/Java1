package windowr;

public class TypeCasting {
	public static void main(String[] args) {
		
		byte b=100;
		int i = b;// automatic type promotion
		System.out.println(i);
		long l=i;
		System.out.println(l);
		
		i=257;
		 b= (byte)i;//Typecasting
		 System.out.println(b);
		 
		 int n1=50;
		 int n2 =10;
		 int result = n1*n2;
		 byte c=(byte)result;
		 System.out.println(c);
		 
		 char f='a';
		 f=95;
		 int ff =97;
		 ff=f;
		 System.out.println(ff);
		 f=(char)ff;
		 System.out.println(f);
		 
		 
		 
		
	}

}
