package ch6;

public class AbstractDemo1 {
	public static void main(String[] args) {
		
		DominoPizza dominos = new IndianDominoPizza();
        
		dominos.makePizza();
		dominos.deliverPizza();
		dominos.makepayment();
	}

}

abstract class DominoPizza{
	final private void makedough(){
		System.out.println("Make dough as per domino standards.....");
	}
	final private void addIngrident() {
		System.out.println("add ingridents as per domino standards.......");
	}
	final private void bakePizza(){
		System.out.println("bake pizza as per domino standards.....");
	}
	
	final public void makePizza() {
		System.out.println("Pizza making started as per dominos standards...");
		makedough();
		addIngrident();
		bakePizza();
		System.out.println("pizza making finised as per dominos standards.....");
	}
	public abstract void deliverPizza();
	public abstract void makepayment();
	
}

class IndianDominoPizza extends DominoPizza{
	@Override
	public void deliverPizza() {
		System.out.println("Deliver Pizza as per your preference....");
		
	}
	@Override
	public void makepayment() {
		System.out.println("get money in indian currency");
		
	}
}