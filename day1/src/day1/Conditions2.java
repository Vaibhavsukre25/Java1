package day1;

public class Conditions2 {
	public static void main(String[] args) {
		
		int i=10;
		int result = i%2;
		System.out.println(result);
		
		// it is boolen type
		boolean res = (result==0);
		System.out.println(res);
		
		boolean res2 = ((i%2)==0);
		System.out.println(res2);
		
		//Ternary Operators
		String s = (res2)?"Even Number....":"Odd Number....";// 1st way
		System.out.println(s);
		
		String s2 = (i%2==0)?"Even Number....":"Odd Number....";
		System.out.println(s2);
		
		System.out.println((i%2==0)?"Even Number....":"Odd Number....");
				
	}
}
