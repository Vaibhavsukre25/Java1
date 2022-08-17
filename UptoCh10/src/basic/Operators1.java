package basic;

public class Operators1 {
	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		boolean b = i==j;
		boolean bo = i!=j;
		boolean boo = i>j;
		boolean booo = i<j;
		System.out.println(b);
		System.out.println(bo);
		System.out.println(boo);
		System.out.println(booo);
		
		boolean result = (i==j && i!=j);
		System.out.println(result);
		boolean result1 = (i==j || i!=j);
		System.out.println(result1);
		
	}

}
