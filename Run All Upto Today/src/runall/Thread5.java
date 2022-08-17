package runall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread5 {

	public static void main1(String[] args) {
		
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(new ChildThread());
	}
	public static void main(String[] args) {
		new Thread5();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}
class ChildThread implements Runnable{
	@Override
	public void run() {
		System.out.println("child thread called...");
	}
}
