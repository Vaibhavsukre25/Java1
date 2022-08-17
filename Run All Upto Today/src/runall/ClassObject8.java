package runall;

public class ClassObject8 {
	public static void main(String[] args) {
		
		DominoPizza pizza=new DominoPizza();
		pizza.makePizza();
	}
}
class DominoPizza{
	String s="Pizza Making..:";
	public void makePizza() {
		s=s+makeFloor(s)+"\n";
		s=s+makeIngredients(s)+"\n";
		s=s+bakePizza(s)+"\n";
		
		System.out.println(s);
	}
	public String makeFloor(String s) {
		return s+" Floor Processed";
	}
	public String makeIngredients(String s) {
		return s+" Ingredients Processed..";
	}
	public String bakePizza(String s) {
		return s+" pizza baked...";
	}

}
