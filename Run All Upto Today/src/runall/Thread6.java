package runall;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread6 {
	public Thread6() {
		ExecutorService es=Executors.newFixedThreadPool(1);
		es.execute(new MyThreadJob1());
		es.shutdown();
	}
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("my main thread...");
		t.setPriority(10);
		System.out.println(t);
		new Thread6();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {Thread.sleep(1000);}catch(Exception e) {}		
		}
	}
}
class MyThreadJob1 implements Runnable{
	@Override
	public void run() {
		System.out.println("child thread called...");	
	}
}

