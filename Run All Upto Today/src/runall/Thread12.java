package runall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
 * Deadlock - Circular dependency between two synchronized blocks will create deadlock
 */
public class Thread12 {
  public static void main(String[] args) {
	
	  ExecutorService es=Executors.newFixedThreadPool(2);
		Crane c=new Crane();
		Frog f=new Frog();
		
		es.execute(new CraneFrogDeathGame("crane", c, f));
		es.execute(new CraneFrogDeathGame("frog", c, f));
		
		es.shutdown();
	}
}
class CraneFrogDeathGame implements Runnable{
	Crane c;Frog f;String name;
	public CraneFrogDeathGame(String name,Crane c,Frog f) {
		this.f=f;this.c=c;
		this.name=name;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		if(name.equals("crane")) {
			c.eat(f);
		}
		else {
			f.escape(c);
		}
	}
}
class Crane{
	synchronized public void eat(Frog frog) {		
		frog.leaveCrane();
		System.out.println("swaha...........");
	}
	synchronized public void leaveFrog() {
		
	}
}
class Frog{
	synchronized public void escape(Crane c) {
		c.leaveFrog();
		System.out.println("frog is dead...");
	}
	synchronized public void leaveCrane() {
		
}

}
