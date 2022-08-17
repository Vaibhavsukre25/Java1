package ch6;

public class StaticMotherKitchen {
	public static void main(String[] args) {
		
		Motherkitchen.food();
		Motherkitchen.food();
		Motherkitchen.food2();
	}

}
class Motherkitchen{
	
	public Motherkitchen() {
		System.out.println("cons called.......");
	}
	static {
		System.out.println("static block called....");
	}
	
	public static  void food() {
	     System.out.println("Yummy...........");	
	}
	
	public static void food2() {
		System.out.println("yummy2..........called");
		
	}
}