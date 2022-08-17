package runall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Thread11 {
	public static void main(String[] args) {
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		Gun bofors=new Gun();
		
		es.execute(new GunJob("filler",bofors));
		es.execute(new GunJob("shooter",bofors));
		
		es.shutdown();
	}
}
class GunJob implements Runnable{
	String name;Gun gun;
	public GunJob(String name,Gun gun) {
		this.name=name;
		this.gun=gun;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.currentThread().setName(name);
		if(name.equals("filler")) {
			for(int i=0;i<5;i++) {
				gun.fill();
			}
		}
		else if(name.equals("shooter")) {
			for(int i=0;i<5;i++) {
				gun.shoot();
			}
		}
	}
}
class Gun{
	boolean flag;
	synchronized public void fill() {
		if(flag) {
			try {
				wait();
			}catch(Exception e) {
				
			}
		}
		System.out.println("fill the gun....");
		flag=true;
		notify();
	}
	synchronized public void shoot() {
		if(!flag) {
			try {
				wait();
			}catch(Exception e) {
				
			}
		}
		System.out.println("shooter will shoot the gun...");
		flag=false;
		notify();
	}

}
