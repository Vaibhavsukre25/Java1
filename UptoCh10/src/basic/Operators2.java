package basic;

public class Operators2 {
	public static void main(String[] args) {
		
		int i=10;
		//i++;
		System.out.println(i++);// This is post increment.....i.e first print and then increment
		System.out.println(i);
		System.out.println(++i);// This is pre increment........i.e first increment and then print 
		
		i=20;
		System.out.println(i--);// this is post decrement i.e first print and then decrement
		System.out.println(i);
		
		System.out.println(--i);// this is pre decrement i.e first decrement and then print
		
		
		i=25;
		i+=5;// i=i+5;
		System.out.println(i);
		
		i=5;
		System.out.println(i==5);
	}

}
