package inheritance;

public class HierarchialInheritance {
	public static void main(String[] args) {
		
		egle e = new egle();
		e.fly();
		e.fly(0);
		peacock p = new peacock();
		p.fly("p");
		
		peacock1 cock = new peacock1();
		cock.fly();
		cock.fly(0);
		cock.fly("hey");
		
	
		
	}

}

class birds{
	public void fly() {
		System.out.println("Fly over the sky.....");
	}
}

class egle extends birds{
	public void fly(int i) {
		System.out.println("I am only one.....");
	}
}
class peacock1 extends egle{
	public void fly(String name) {
		System.out.println("i am king of all birds....555555555..");
	}
}

class peacock extends birds{
	public void fly(String name) {
		System.out.println("i am king of all birds......");
	}
}