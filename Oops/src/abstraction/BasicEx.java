package abstraction;

public class BasicEx {
	public static void main(String[] args) {
		
		
		Horse hh = new Horse();
		hh.walk();
		hh.eats();
	}

}

abstract class Animal{
	abstract void walk ();
	public void eats() {
		System.out.println("Eating......");
	}
}
class Horse extends Animal{
	public void walk() {
		System.out.println("walk on 4 legs.....");
	}
}
class chicken extends Animal{
	public void walk() {
		System.out.println("walk on 2 legs......");
	}
}