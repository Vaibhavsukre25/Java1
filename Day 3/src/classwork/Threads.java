package classwork;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads {

	
	
		
			public static void main(String[] args) {
				Thread t=Thread.currentThread();
				
				System.out.println(t);
				
				System.out.println("boiling milk.");
				//ExecutorService es=Executors.newFixedThreadPool(1);//this executor framework will create a thread...
				//es.submit(new MyThreadJob());
				met();
				System.out.println("cooking rice...");
			}
			public static void met() {
				try{Thread.sleep(5000);}catch(Exception e) {}
				System.out.println("cooking idly...");
			}
		}
		class MyThreadJob implements Callable{
			@Override
			public Object call() throws Exception {
				try{Thread.sleep(5000);}catch(Exception e) {}
				System.out.println("cooking idly...");
				return null;
			}
		
	}
