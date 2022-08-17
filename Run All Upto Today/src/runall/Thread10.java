package runall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread10 {
	public Thread10() {
		Kitchen myKitchen=new Kitchen();
		ExecutorService es=Executors.newFixedThreadPool(4);
		es.execute(new KitchenJob("ramu",myKitchen));
		es.execute(new KitchenJob("somu",myKitchen));
		es.execute(new KitchenJob("monu",myKitchen));
		es.execute(new KitchenJob("jonu",myKitchen));
		
		es.shutdown();
	}
	public static void main(String[] args) {
		new Thread10();
		
//		Kitchen myKitchen=new Kitchen();
//		myKitchen.cutOnion();
//		myKitchen.cutVeg();
//		myKitchen.boilRice();
//		myKitchen.cookBriyani();
	}
}
class KitchenJob implements Runnable{
	String name;Kitchen kitchen;
	public KitchenJob(String name,Kitchen kitchen) {
		this.name=name;
		this.kitchen=kitchen;
	}
	@Override
	public void run() {
		Thread.currentThread().setName(name);
		switch(name){
			case "ramu":{
				kitchen.cutOnion();
				break;
			}
			case "somu":{
				kitchen.cutVeg();
				break;
			}
			case "monu":{
				kitchen.boilRice();
				break;
			}
			case "jonu":{
				kitchen.cookBriyani();
				break;
			}
		}
	}
}
class Kitchen{
	public void cutOnion() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" is cutting onions....");
		System.out.println("After cutting onion"+name+" is taking a 10 sec break...");
		try {Thread.sleep(10000);}catch(Exception e) {}
	}
	
	public void cutVeg() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" is cutting Vegetables....");
		System.out.println("After cutting veg"+name+" is taking a 10 sec break...");
		try {Thread.sleep(10000);}catch(Exception e) {}
	}
	public void boilRice() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" is boiling rice....");
		System.out.println("After boiling rice "+name+" is taking a 10 sec break...");
		try {Thread.sleep(10000);}catch(Exception e) {}
	}
	public void cookBriyani() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" is cooking briyani....");
		System.out.println("briyani made....");

}
}
