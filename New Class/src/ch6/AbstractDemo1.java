package ch6;

public class AbstractDemo1 {
     public static void main(String[] args) {
		
    	 DominoPizza dominos = new IndianDominoPizza();
    	 dominos.makepizza();
    	 dominos.deliverpizza();
    	 dominos.collectpayment();
	}
}
abstract class DominoPizza{
	final private void makeDought() {
		System.out.println("Dominos screct of making dought.....");
	}
	final private void addIngredients() {
		System.out.println("dominos secret ingredient added..");
	}
	final private void bakepizza() {
		System.out.println("Dominos secret baking....");
	}
	final public void makepizza() {
		System.out.println("Pizza domino making started....");
		makeDought();
		addIngredients();
		bakepizza();
		System.out.println("Pizza created as per indian standards...");
		
	}
	public abstract void deliverpizza();
	public abstract void collectpayment();
	
}

class IndianDominoPizza extends DominoPizza {
	@Override
	public void collectpayment() {
		System.out.println("Collect payment as per indian standards....");
		
	}
	@Override
	public void deliverpizza() {
	System.out.println("deliver pizza as per indian standards....");
		
	}
}