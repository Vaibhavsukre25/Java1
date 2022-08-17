package runall;

public class ClassObject15 {
	public static void main(String[] args) {
		
//		Human shoiab=new Human();
//		Human ramu=new Human();
		Cman.met();
		Cman.met2();
	}
}
/*
 * Constructor - What is needed for the mere survival of the object is added during construction phase
 * A constructor is defined like a method, but the method will have the same class name with no return or void
 * Constructor can be empty or it can also have parameter.
 * The name of the class and the constructor should be same
 * The constructors are called exactly before the object is ready.
 * By default all classes have default constructor that is empty constructor
 * if you want u can override that, by writing your own constructor
 */
class Cman{
	public Cman() {
		System.out.println("human is crying...");
	}
	
	//static block is a replacement for constructor - incase of static methods
	static {
		//initialization code needed for the survival of the static methods can be
		//written inside the static block
		//static block code gets called only once, like constructor
		System.out.println("static block is called..");
	}
	public static void met() {
		System.out.println("static method called...");
	}
	public static void met2() {
		System.out.println("static method222222 called...");
	}
class Whale{
	public Whale() {
		
	}
}
class Giraffe{
	public Giraffe() {
	}
}
}
		
	



