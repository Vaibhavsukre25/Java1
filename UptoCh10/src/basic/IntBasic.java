package basic;

public class IntBasic {

	public static void main(String[] args) {
		
		Integer i =10;
		i= new Integer(10);
		i= Integer.valueOf(10);
		System.out.println(i);
		
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		
		System.out.println(Integer.max(20, 10));
		
		System.out.println(Integer.min(25, 10));
		
		System.out.println(Integer.reverse(25));
		
		System.out.println(Integer.sum(25, 20));
		
		String num1 = "300";
		String num2 = "200";
		
		System.out.println(num1+num2);
		
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		System.out.println(n1+n2);
		System.out.println("Value of sum of two numbers.........." + ((Integer.parseInt(num1)) + (Integer.parseInt(num2))));
	}
}
