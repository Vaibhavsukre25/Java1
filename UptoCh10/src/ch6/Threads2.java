package ch6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads2 {
	public static void main(String[] args) {
		
		//Thread t = new Thread(new ThreadJob());
		//t.start();
		
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(new ThreadJob());
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {Thread.sleep(100);}catch(Exception e) {}
		}
		es.shutdown();
		
		
	}
	static void met() {
		System.out.println("child thread called from met method...");
	}

}

class ThreadJob implements Runnable{
	@Override
	public void run() {
		System.out.println("Child thread called......");
		
	}
}