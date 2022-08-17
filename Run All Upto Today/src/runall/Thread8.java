package runall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Thread8 {
	public static void main(String[] args) {
		
		ExecutorService es=Executors.newFixedThreadPool(3);
		CounsellingHall hall=new CounsellingHall();
		
		es.execute(new CounsellingWork(hall,"ram"));
		es.execute(new CounsellingWork(hall,"mohan"));
		es.execute(new CounsellingWork(hall,"rahim"));
		
		es.shutdown();
	}
}
class CounsellingWork implements Runnable{
	CounsellingHall hall;String name;
	public CounsellingWork(CounsellingHall hall,String name) {
		this.hall=hall;
		this.name=name;
	}
	@Override
	
	
	public void run() {
		Thread.currentThread().setName(name);
		if(name.equals("mohan")) {
			hall.water();
			hall.table1();
			hall.table2();
			hall.table3();
		}
		else {
			hall.table1();
			hall.table2();
			hall.table3();
		}
	}
}

class CounsellingHall{
	synchronized public void table1() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" is in table 1...");
	}
	synchronized public void table2() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" is in table 2...");
	}
	synchronized public void table3() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" is in table 3...");
	}
	public void water() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" having water...");
	}
	//@Override
	

}
