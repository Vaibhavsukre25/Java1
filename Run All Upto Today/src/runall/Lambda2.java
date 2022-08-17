package runall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Lambda2 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		es.execute(new Runnable() {			
			@Override
			public void run() {
				System.out.println("anonymous implementation....");	
			}
		});
		es.execute(()->{System.out.println("child thread called...");});
		es.execute(Lambda2::met);
	}
	
	public static void met() {
		System.out.println("child thread called in method referencing.........");
	}
}

