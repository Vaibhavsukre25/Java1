package runall;

public class ClassObject16 {
public static void main(String[] args) {
	
	Calculator1 sanyo=new Calculator1();
	
	System.out.println("Addition..:"+sanyo.add(10,20));
	System.out.println("Substraction..:"+sanyo.sub(20,20));
	System.out.println("Multiplication..:"+sanyo.mul(10,20));
	System.out.println("Division..:"+sanyo.div(10,20));
	System.out.println("Number type..:"+sanyo.checkNumber(10));
}
}
//A class is a blueprint, a plan or a description/specification of an object
//With one class you can create multiple objects
//Classes are generally nouns
//behaviour and properties (Methods and Data add value to the classes)
class Calculator1{
public int add(int i,int j) {
	return i+j;
}
public int sub(int i,int j) {
	return i-j;
}
public int mul(int i,int j) {
	return i*j;
}
public int div(int i,int j) {
	return i/j;
}
public String checkNumber(int i) {
	if(i%2==0) {
		return "Even Number....";
	}
	else {
		return "Odd Number.........";
	}
}
}
