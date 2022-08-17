package ch6;

public class StaticDemo {
	public static void main(String[] args) {
		MothersKitchen.food();
		MothersKitchen.food();
		MothersKitchen.food2();
	}

}

class MothersKitchen{
	
	static {
		System.out.println("Static block......");
	}
	public static void food() {
		System.out.println("yummy.............");
	}
	public static void food2() {
		System.out.println("yummy222222222222......");
	}
	
}