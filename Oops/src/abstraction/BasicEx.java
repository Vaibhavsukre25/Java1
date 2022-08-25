package abstraction;

public class BasicEx {
	public static void main(String[] args) {
		
		
		/*Horse hh = new Horse();
		hh.walk();
		hh.eats();*/
		
		chicken ck = new chicken();
		ck.eats();
		ck.walk();
		
		
	}

}

interface Animal{
	abstract void walk ();
	public void eats();
}
/*class Horse extends Animal{
	public void walk() {
		System.out.println("walk on 4 legs.....");
	}
}*/
class chicken implements Animal{
	public void walk() {
		System.out.println("walk on 2 legs......");
	}
	@Override
	public void eats() {
		System.out.println("hgyf");
		
	}
}