package onclass;

public class DominoPizza {
	public static void main(String[] args) {
		
	//	Dominos dominopizza = new Domino();
	  // dominopizza.sellPizza();
		
		
	}
abstract class Dominos{
	private void makedough() {
		System.out.println("dough made as per domino standards.....");
	}
	private void addIngredients() {
		System.out.println("ingredients are added as per domino standards....");
	}
	private void bakepizza() {
		System.out.println("bake pizza as per domino standards....");
	}
      private void  makepizza() {
		makedough();
		addIngredients();
		bakepizza();
	}
	abstract public void acceptmoney();
	abstract public void deliverpizza();
	final public void sellPizza() {
		acceptmoney();
		makepizza();
		deliverpizza();
		
	}	
 }
class Domino extends Dominos{
	@Override
	public void acceptmoney() {
		System.out.println("money will be accepted in ruppess.....");
	}
	@Override
	public void deliverpizza() {
		System.out.println("pizza will be deliver by bike........");
		
	}
 }
}
