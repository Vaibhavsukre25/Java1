package ch6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads5 {
	public static void main(String[] args) throws Exception {
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		es.execute(()->{
			synchronized (ClassLock.class) {
				new ClassLock().met();
			}
		});
		es.execute(()->{
			synchronized (ClassLock.class) {
				new ClassLock().met();
			}
		});
		es.execute(()->{
			synchronized (ClassLock.class) {
				new ClassLock().met();
			}
		});
		es.execute(()->{
			synchronized (ClassLock.class) {
				new ClassLock().met();
			}
		});
		//es.execute(()->{new ClassLock().met();});
		//es.execute(()->{new ClassLock().met();});
		//es.execute(()->{new ClassLock().met();});
		//es.execute(()->{new ClassLock().met();});
		es.shutdown();
	}

}
class ClassLock{
	/*synchronized*/ public static void met() {
		System.out.println("met called.......");
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println("Calling met is over......");
	}
}