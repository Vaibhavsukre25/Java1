package runall;

public class Operator1 {
public static void main(String[] args) {
	
	int i=11;
	int j=2;
	
	System.out.println("Addition.+.:"+(i+j));//do addition
	System.out.println("Substraction.-.:"+(i-j));//do subtraction
	System.out.println("Multiplication.*.:"+(i*j));//multiplication
	System.out.println("Division.-quotient../.:"+(i/j));//division - quotient
	System.out.println("Division..-reminder.%(mod).:"+(i%j));//division - reminder
	
	int x=i;//= is a assignment operator, now x value will be having the i value//
	System.out.println(x);
	//x++ is similar to x=x+1;
	//x++ - post increment and ++x is preincrement
	
	System.out.println(x++);//x++ will first print the x value and then increments
	System.out.println(x);
	
	System.out.println(++x);//++x will first increment the x value and then prints
	
	
	int n=100;
	System.out.println(++n);//it will increment n first and then prints.
	int m=1000;
	System.out.println(m++);//it will print first then increment
	System.out.println(m);
	
	int nn=100;
	System.out.println(--nn);//it will decrement nn first and then prints.
	int mm=1000;
	System.out.println(mm--);//it will print mm first then decrement
	System.out.println(mm);
	
	
	System.out.println(x!=i);//comparison operator- return a boolean and this is a relational operator
	//note: relational operators always return true or false
}
}
