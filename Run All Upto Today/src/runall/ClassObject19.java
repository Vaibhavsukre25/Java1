package runall;

/*
 * Inheritance - kind of relationship - generalization
 *
 * 1. Removal of if-else-if conditions
 * 2. Object Reusability
 * 3. Code Reusability
 */

public class ClassObject19 {
public static void main(String[] args) {
	
	SubClass sc=new SubClass();
	System.out.println(sc.i);
	sc.met();
}
}
abstract class SuperClass{
public SuperClass() {
	System.out.println("super class cons called...");
}
public SuperClass(int i) {
	System.out.println("super class cons called............................"+i);
}
public SuperClass(int i,String s) {
	System.out.println("super class cons called............................"+i+":"+s);
}

int i=10;
public void met() {
	System.out.println("parent met ....");
}
}
class SubClass extends SuperClass{
public SubClass() {
	super(10000,"hello world");//calling the super class constructor should be the first line
	System.out.println("sub class cons called...");
}
int i=100;
public void met() {
	System.out.println("child met called...");
	super.met();
	System.out.println(i);
	System.out.println(super.i);
}
}
