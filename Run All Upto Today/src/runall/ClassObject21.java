package runall;

public class ClassObject21 {
public static void main(String[] args) {
	
	Dominos dominos=new ChennaiDominos();
	dominos.getPayment();
	dominos.delivery();
}
}
//final class A{}
//class B extends A{}
abstract class Dominos{
public abstract void delivery();
public abstract void getPayment();
final public void makeDough() {
	System.out.println("dough is made as per dominos....");
}
final public void makeIngredients() {
	System.out.println("dominos was of making ingredients....");
}
final public void packing() {
	System.out.println("dominos way of packing......");
}
final public void baking() {
	System.out.println("dominos way of baking....");
}
final public void makePizza() {//template method
	makeDough();
	baking();
	makeIngredients();
	packing();
}
}
class ChennaiDominos extends Dominos{
// float pi=3.14f;
@Override
public void delivery() {
	// TODO Auto-generated method stub
	//pi=34.56f;
	makePizza();
	System.out.println("done delivery through bike..in chennai...");
}
@Override
public void getPayment() {
	System.out.println("Payment received...");
}
}
