package runall;

public class TypeCasting5 {
	public static void accept(Engineer e) {
		e.doPlan();
}
public static void accept(Clerk clr) {
	clr.doAccounting();
}

public static void get(Object e) {
	Engineer eng=(Engineer)e;
	eng.doPlan();
}
public static void main(String[] args) {
	Employee e1=new Engineer();
	Employee e2=new Clerk();
	Employee e3=new Security();
	//accept((Engineer)e1);
	//accept((Clerk)e2);
	get(e1);
}
}
class Employee{

}
class Engineer extends Employee{
public void doPlan() {
	System.out.println("engineering plan done...");
}
}
class Clerk extends Employee{
public void doAccounting() {
	System.out.println("Accounting doone....");
}
}
class Security extends Employee{

}
